package br.com.solApi.Service;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import br.com.solApi.dao.SolDao;
import br.com.solApi.mapperService.MapperWebService;
import br.com.solApi.model.Sol;

@WebService(endpointInterface = "br.com.solApi.mapperService.MapperWebService")
public class Service implements MapperWebService {

	public Sol criarInformacao(Sol sol) {
		SolDao dao = new SolDao();
		try {
			return dao.saveAll(sol);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Sol alterarInformcao(Sol sol) {
		SolDao dao = new SolDao();
		try {
			return dao.updateData(sol);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Sol deletarData(Sol sol) {
		SolDao dao = new SolDao();
		try {
			return dao.deletar(sol);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Sol findById(int id) throws SQLException {
		SolDao dao = new SolDao();
		return dao.findById(id);
	}

 	public List<Sol> exibirDataAll() {
		SolDao dao = new SolDao();
		try {
			return dao.listar();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
