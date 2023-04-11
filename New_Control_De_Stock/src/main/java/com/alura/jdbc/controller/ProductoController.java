package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alura.jdbc.factory.ConnectionFactory;


public class ProductoController {

	public int modificar(String nombre, String descripcion, Integer id, Integer cantidad) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperaConexion();
		
		Statement statement = connection.createStatement();
		
		statement.execute("UPDATE PRODUCTO SET "
				+ " NOMBRE = '" + nombre + "'"
				+ ", DESCRIPCION = '"  + descripcion + "'"
				+ ", CANTIDAD = " + cantidad
				+ " WHERE ID = " + id);
		
		
		int updateCount = statement.getUpdateCount();
		
		connection.close();
		
		return updateCount;
		
	}

	public int eliminar(Integer id) throws SQLException {
		Connection connection = new ConnectionFactory().recuperaConexion();
		
		Statement statement = connection.createStatement();
		
		statement.execute("DELETE FROM PRODUCTO WHERE ID = " + id);
		
		return statement.getUpdateCount();
		
	}

	public List<Map<String, String>> listar() throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperaConexion();
		
		
		Statement statement = connection.createStatement();
		
		statement.execute("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
		
		ResultSet resultSet = statement.getResultSet();
		
		List<Map<String, String>> resultado = new ArrayList<>();
		
		while(resultSet.next()) {
			
			Map<String, String> fila = new HashMap<>();
			fila.put("ID",String.valueOf(resultSet.getInt("ID")));
			fila.put("NOMBRE", resultSet.getString("NOMBRE"));
			fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
			fila.put("CANTIDAD",String.valueOf(resultSet.getInt("CANTIDAD")));
			
			resultado.add(fila);
		}
		
		connection.close();
		
		return resultado;
	}

    public void guardar(Map<String, String> producto) throws SQLException {
		Connection connection = new ConnectionFactory().recuperaConexion();
		
		Statement statement = connection.createStatement();
		
		statement.execute("INSERT INTO PRODUCTO(nombre, descripcion, cantidad) "
				+ " VALUES('" + producto.get("NOMBRE") + "', '"
				+ producto.get("DESCRIPCION") + "', "
				+ producto.get("CANTIDAD") + ")", statement.RETURN_GENERATED_KEYS);
		
		ResultSet resultSet = 	statement.getGeneratedKeys();
		
		while(resultSet.next()) {
		
			System.out.println(
					String.format(
							"Fue insertado el producto de ID %d", 
							resultSet.getInt(1)));
		}
		
	}

}
