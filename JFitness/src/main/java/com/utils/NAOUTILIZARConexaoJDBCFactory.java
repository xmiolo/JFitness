package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NAOUTILIZARConexaoJDBCFactory{
	
	public NAOUTILIZARConexaoJDBCFactory() {
		
	}
	
	public Connection getConexao() {
		try {
			//System.out.println("Conectando!");
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/jfitness", "postgres", "123");
		} catch (SQLException e) {
			System.out.println("Falha na Conex�o com o banco!");
			e.printStackTrace();
		}
		return null;
	}
	
}
