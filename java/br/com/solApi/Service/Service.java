package br.com.solApi.Service;

import java.sql.SQLException;

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

}
