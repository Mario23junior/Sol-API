package br.com.solApi.mapperService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.solApi.model.Sol;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface MapperWebService {
  
	@WebMethod
	boolean criarInformacao(Sol sol);
}
