package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alura.jdbc.factory.ConnectionFactory;

public class ProductoControllerOldVersion {

	public int modificar(String nombre, String descripcion, Integer id, Integer cantidad) throws SQLException {

		final Connection connection = new ConnectionFactory().recuperaConexion();

		try (connection) {
//		Statement statement = connection.createStatement();
//		statement.execute("UPDATE PRODUCTO SET "
//				+ " NOMBRE = '" + nombre + "'"
//				+ ", DESCRIPCION = '"  + descripcion + "'"
//				+ ", CANTIDAD = " + cantidad
//				+ " WHERE ID = " + id);

			final PreparedStatement statement = connection.prepareStatement("UPDATE PRODUCTO SET " + " NOMBRE = ? "
					+ ", DESCRIPCION = ? " + ", CANTIDAD = ? " + " WHERE ID = ? ");

			try (statement) {
				statement.setString(1, nombre);
				statement.setString(2, descripcion);
				statement.setInt(3, cantidad);
				statement.setInt(4, id);

				statement.execute();

				int updateCount = statement.getUpdateCount();

				return updateCount;

			}
		}

	}

	public int eliminar(Integer id) throws SQLException {

		final Connection connection = new ConnectionFactory().recuperaConexion();
//OLD VERSION VULNERBLE TO SQL INJECTIONS		
//		Statement statement = connection.createStatement();
//		statement.execute("DELETE FROM PRODUCTO WHERE ID = " + id);

		try (connection) {

			final PreparedStatement statement = connection.prepareStatement("DELETE FROM PRODUCTO WHERE ID = ?");

			try (statement) {
				statement.setInt(1, id);
				statement.execute();

				return statement.getUpdateCount();
			}

		}

	}

	public List<Map<String, String>> listar() throws SQLException {

		final Connection connection = new ConnectionFactory().recuperaConexion();

		try (connection) {

			// OLD VERSION VULNERBLE TO SQL INJECTIONS
			// Statement statement = connection.createStatement();
			//
			// statement.execute("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");

			final PreparedStatement statement = connection
					.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");

			try (statement) {
				statement.execute();

				ResultSet resultSet = statement.getResultSet();

				List<Map<String, String>> resultado = new ArrayList<>();

				while (resultSet.next()) {

					Map<String, String> fila = new HashMap<>();
					fila.put("ID", String.valueOf(resultSet.getInt("ID")));
					fila.put("NOMBRE", resultSet.getString("NOMBRE"));
					fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
					fila.put("CANTIDAD", String.valueOf(resultSet.getInt("CANTIDAD")));

					resultado.add(fila);
				}

				return resultado;
			}
		}
	}

	public void guardar(Map<String, String> producto) throws SQLException {
		String nombre = producto.get("NOMBRE");
		String descripcion = producto.get("DESCRIPCION");
		Integer cantidad = Integer.valueOf(producto.get("CANTIDAD"));
		Integer maximoCantidad = 50;

		final Connection connection = new ConnectionFactory().recuperaConexion();

		try (connection) {
			connection.setAutoCommit(false);

			// OLD VERSION VULNERBLE TO SQL INJECTIONS
			// Statement statement = connection.createStatement();
			//
			// statement.execute("INSERT INTO PRODUCTO(nombre, descripcion, cantidad) "
			// + " VALUES('" + producto.get("NOMBRE") + "', '"
			// + producto.get("DESCRIPCION") + "', "
			// + producto.get("CANTIDAD") + ")", statement.RETURN_GENERATED_KEYS);

			final PreparedStatement statement = connection.prepareStatement(
					"INSERT INTO PRODUCTO(nombre, descripcion, cantidad)" + "VALUES (? , ? , ?)",
					Statement.RETURN_GENERATED_KEYS);

			try (statement) {

				do {
					int cantidadParaGuardar = Math.min(cantidad, maximoCantidad);

					ejecutaRegistro(nombre, descripcion, cantidadParaGuardar, statement);

					cantidad -= maximoCantidad;
				} while (cantidad > 0);

				connection.commit();
				System.out.println("COMMIT");

			} catch (Exception e) {
				connection.rollback();
				System.out.println("ROLLBACK");
			}

		}

	}

	private void ejecutaRegistro(String nombre, String descripcion, Integer cantidad, PreparedStatement statement)
			throws SQLException {
		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);

		statement.execute();

		final ResultSet resultSet = statement.getGeneratedKeys();

		try (resultSet) {

			while (resultSet.next()) {

				System.out.println(String.format("Fue insertado el producto de ID %d", resultSet.getInt(1)));
			}
		}

	}

}
