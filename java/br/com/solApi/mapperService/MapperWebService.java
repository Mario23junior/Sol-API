package br.com.solApi.mapperService;

import java.sql.SQLException;
import java.util.List;

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
	@WebMethod(action = "cadastrando" , operationName = "Salvando")
	@WebResult(name = "dadosCriados")
	Sol criarInformacao(@WebParam(name = "SolValores") Sol sol);
	
	@RequestWrapper(localName = "AlterandoDados")
	@ResponseWrapper(localName = "Alterar")
	@WebMethod(action = "Alterando" , operationName = "Atualizando")
	@WebResult(name = "DadosAlterados")
	Sol alterarInformcao(@WebParam(name = "SolValores") Sol sol);
	
	@RequestWrapper(localName = "ListandoTodas")
	@ResponseWrapper(localName = "Listando")
	@WebMethod(action = "ListaCompleta" , operationName = "ListaDeTodos")
	@WebResult(name = "ListaCientifica")
	List<Sol> exibirDataAll();
	
	@RequestWrapper(localName = "DeletandoDados")
	@ResponseWrapper(localName = "deletar")
	@WebMethod(action = "Deletando" , operationName = "exluindo")
	@WebResult(name = "deletandoInformcao")
	Sol deletarData(@WebParam(name = "SolDeletar")Sol sol);
	
	@RequestWrapper(localName = "listandoDadosId")
	@ResponseWrapper(localName = "listId")
	@WebMethod(action = "listandoPorId" , operationName = "listaId")
	@WebResult(name = "listandoInformacoes")
	Sol findById(@WebParam(name = "SolValores") int id) throws SQLException;
}



















