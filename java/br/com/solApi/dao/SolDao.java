package br.com.solApi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.solApi.Conection.Conexao;
import br.com.solApi.model.Sol;

public class SolDao {

	public Sol saveAll(Sol sol) throws SQLException {
		String sql = "insert into sol (magnitude_aparente,metalicidade,adjetivo,raio_equatorial,obliquidade,declinacao,tipo"
				+ "values (?,?,?,?,?,?,?)";

		Connection con = Conexao.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);

		try {
 			ps.setString(2, sol.getMagnitude_aparente());
			ps.setDouble(3, sol.getMetalicidade());
			ps.setString(4, sol.getAdjetivo());
			ps.setString(5, sol.getRaio_equatorial());
			ps.setDouble(6, sol.getObliquidade());
			ps.setString(7, sol.getDeclinacao());
			ps.setString(8, sol.getTipo());
 
			return sol;
		} catch (SQLException e) {
			e.getStackTrace();
		} finally {
			ps.close();
		}
		return null;
	}
}
