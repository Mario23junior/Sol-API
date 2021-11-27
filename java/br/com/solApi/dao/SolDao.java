package br.com.solApi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.solApi.Conection.Conexao;
import br.com.solApi.model.Sol;

public class SolDao {

	public boolean saveAll(Sol sol) throws SQLException {
		String sql = "insert into sol (magnitude_aparente,metalicidade,adjetivo,"
				+ "raio_equatorial,obliquidade,declinacao,tipo) "
				+ " values (?,?,?,?,?,?,?);";

		Connection con = Conexao.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);

		try {
  			ps.setString(1, sol.getMagnitude_aparente());
			ps.setDouble(2, sol.getMetalicidade());
			ps.setString(3, sol.getAdjetivo());
			ps.setString(4, sol.getRaio_equatorial());
			ps.setDouble(5, sol.getObliquidade());
			ps.setString(6, sol.getDeclinacao());
			ps.setString(7, sol.getTipo());
			ps.execute();
			
			return true;
		} catch (SQLException e) {
			e.getStackTrace();
		} finally {
			ps.close();
		}
		System.out.println("Errooo........");
		return false;
	}
}
