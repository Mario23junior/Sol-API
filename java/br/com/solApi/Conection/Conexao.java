package br.com.solApi.Conection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	private static final Connection connection = FactoryConnection();

	private static Connection FactoryConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/sol_base";
			String user = "root";
			String pass = "arvore123";

			return DriverManager.getConnection(url, user, pass);
		} catch (Exception ex) {
			System.out.println("Erro na conexão : " + ex.getMessage());
		}
		return null;
	}

	public static Connection getConnection() {
		return connection;
	}
}
