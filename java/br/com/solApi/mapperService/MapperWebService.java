package br.com.solApi.mapperService;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.solApi.model.Sol;

@WebService
public interface MapperWebService {
  
	@WebMethod
	Sol criarInformacao(Sol sol);
}
