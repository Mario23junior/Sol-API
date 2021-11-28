package br.com.solApi.mapperService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.solApi.model.Sol;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface MapperWebService {
   
	@RequestWrapper(localName = "CadastrandoDados")
	@ResponseWrapper(localName = "DadosSol")
	@WebMethod(action = "cadastrando" , operationName = "CriarDados")
	@WebResult(name = "dadosCriados")
	Sol criarInformacao(@WebParam(name = "SolValores") Sol sol);
}
