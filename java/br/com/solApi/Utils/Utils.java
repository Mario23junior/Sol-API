package br.com.solApi.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.solApi.Conection.Conexao;
import br.com.solApi.exception.CustomMessageException;
import br.com.solApi.model.Sol;

public class Utils {
   
	public void ExceptinDuplicateErroImple(Sol sol){
	    if (ExceptinDuplicateErro(sol)) {
	        throw new CustomMessageException(String.format("Este valor já existe no banco de dados"));
	    }
	}
	
	public boolean ExceptinDuplicateErro(Sol sol) {
		 try {
		        String sql = "SELECT tipo FROM sol WHERE tipo like ?";
				Connection con = Conexao.getConnection();
		        PreparedStatement stmt = con.prepareStatement(sql);
		        
		        stmt.setString(1, sol.getTipo());
		        ResultSet result = stmt.executeQuery();
		        return result.next();
		    } catch (SQLException u) {
		        throw new RuntimeException(u);
		    }
	}
}
