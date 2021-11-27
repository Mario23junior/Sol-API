package br.com.solApi.Conection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
   
	private static final Connection connection = FactoryConecation();
	
	private static Connection FactoryConecation() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String base = "sol_base";
			String pass = "arvore123";
			String user = "root";
			
			String urlBase = "jdbc:mysql://localhost:3306/"+base+pass+user;
			return DriverManager.getConnection(urlBase);
		} catch (Exception ex) {
			System.out.println("Erro na conexão : " + ex.getMessage());
 		}
		return null;
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
