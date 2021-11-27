package br.com.solApi.Service;

import java.sql.SQLException;

import javax.jws.WebService;

import br.com.solApi.dao.SolDao;
import br.com.solApi.mapperService.mapper;
import br.com.solApi.model.Sol;

@WebService(endpointInterface = "br.com.solApi.mapperService.mapper")
public class Service implements mapper {

	public boolean criarInformacao(Sol sol) {
		SolDao dao = new SolDao();
		try {
			return dao.saveAll(sol);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
