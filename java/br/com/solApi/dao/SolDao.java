package br.com.solApi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.solApi.Conection.Conexao;
import br.com.solApi.Utils.Utils;
import br.com.solApi.exception.CustomMessageException;
import br.com.solApi.model.Sol;

public class SolDao {

	public Utils utils;

	public Sol saveAll(Sol sol) throws SQLException {
		String sql = "insert into sol (magnitude_aparente," + "metalicidade,adjetivo, "
				+ " raio_equatorial,obliquidade,declinacao,tipo) " + " values (?,?,?,?,?,?,?);";

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
			return sol;
		} catch (SQLException e) {
			e.getStackTrace();
		} finally {
			ps.close();
		}
		throw new CustomMessageException("Erro ao cadastrar valores no banco de dados");

	}

	public Sol updateData(Sol sol) throws SQLException {
		utils.ExceptinDuplicateErroImple(sol);
		String sql = "update sol set magnitude_aparente = ?," + " metalicidade = ? ,adjetivo = ?, "
				+ " raio_equatorial = ? ,obliquidade = ?," + " declinacao = ?,tipo = ? " + " where id = ?;";
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
			ps.setInt(8, sol.getId());

			ps.execute();
			return sol;
		} catch (SQLException e) {
			e.getStackTrace();
		} finally {
			ps.close();
		}
		throw new CustomMessageException("Erro ao Atualizar informações");
	}

	public ArrayList<Sol> listar() throws SQLException {
		String sql = "select * from sol;";
		ArrayList<Sol> sol = new ArrayList<Sol>();

		Connection con = Conexao.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery(sql);

		try {
			while (rs.next()) {
				Sol DataSol = new Sol();
				DataSol.setId(rs.getInt("id"));
				DataSol.setMagnitude_aparente(rs.getString("Magnitude_aparente"));
				DataSol.setMetalicidade(rs.getDouble("Metalicidade"));
				DataSol.setAdjetivo(rs.getString("Adjetivo"));
				DataSol.setRaio_equatorial(rs.getString("Raio_equatorial"));
				DataSol.setObliquidade(rs.getDouble("Obliquidade"));
				DataSol.setDeclinacao(rs.getString("Declinacao"));
				DataSol.setTipo(rs.getString("Tipo"));

				sol.add(DataSol);
				return sol;

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			ps.close();
		}
		throw new CustomMessageException("Erro ao listar informações");
	}

    public Sol deletar (Sol sol) throws SQLException {
        String sql = "delete from sol where id = ? ;";
    
        Connection con = Conexao.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        try {            
            ps.setInt(1, sol.getId());
            ps.execute();
            throw new CustomMessageException("Informação deletada com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            ps.close();
        }
		throw new CustomMessageException("Erro ao deletar informações");
    }

	public Sol findById(int id) throws SQLException {
 		
 		String sql = "select * from som where id = ?";
		Sol not = null;
 		
 		Connection con = Conexao.getConnection();
 		PreparedStatement ps = con.prepareStatement(sql);
 		ps.setInt(1, id);
 		ResultSet rs = ps.executeQuery();
 		
 		try {
 			if(rs.next()) {
 			  not = new Sol();
 			  not.setId(rs.getInt("id"));
 			  not.setMagnitude_aparente(rs.getString("Magnitude_aparente"));
 			  not.setMetalicidade(rs.getDouble("Metalicidade"));
 			  not.setAdjetivo(rs.getString("Adjetivo"));
 			  not.setRaio_equatorial(rs.getString("Raio_equatorial"));
 			  not.setObliquidade(rs.getDouble("Obliquidade"));
 			  not.setDeclinacao(rs.getString("Declinacao"));
 			  not.setTipo(rs.getString("Tipo"));
 			}
 		} catch (SQLException e) {
 			e.printStackTrace();
 		} finally {
 			rs.close();
 			ps.close();
 		}
		return not;	
	}
   
}


























