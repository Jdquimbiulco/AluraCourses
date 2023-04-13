package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	private  DataSource dataSource;
	
	public ConnectionFactory() {
		var pooledDataSource = new ComboPooledDataSource();
		pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
		pooledDataSource.setUser("root");
		pooledDataSource.setPassword("SQL1553");	
		
		this.dataSource = pooledDataSource;
	
	}
	
	public Connection recuperaConexion() throws SQLException {
	return this.dataSource.getConnection();	
}
	
//OLD VERSION PURE CONNECTION METHOD WITH OUT POOL 	
//	public Connection recuperaConexion() throws SQLException {
//		return DriverManager.getConnection(
//		"jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
//		"root",
//		"SQL1553");
//			
//	}

}
