package br.com.solApi.publisher;

import javax.xml.ws.Endpoint;

import br.com.solApi.Service.Service;

public class Publisher {
    
	public static void main(String[] args) {
		
		String porta = "8085";
		System.out.println("publicando Serviço na porta : "+ porta);
 		Endpoint.publish("http://localhost:"+porta+"/sol",new Service());
 		String service = "http://localhost:"+porta+"/sol?wsdl";
 		System.out.println("publicando serviço na URL : "+ service);
			
	}
}
