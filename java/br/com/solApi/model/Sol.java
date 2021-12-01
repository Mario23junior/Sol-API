package br.com.solApi.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Sol {
  
	@XmlElement(required = false)
	private Integer id;
	
	@XmlElement(required = true)
	private String magnitude_aparente;
	
	@XmlElement(required = true)
	private Double metalicidade;
	
	@XmlElement(required = true)
	private String adjetivo;
	
	@XmlElement(required = true)
	private String raio_equatorial;
	
	@XmlElement(required = true)
	private Double obliquidade;
	
	@XmlElement(required = true)
	private String declinacao;
	
	@XmlElement(required = true)
	private String tipo;
	
	public Sol() {
 	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMagnitude_aparente() {
		return magnitude_aparente;
	}

	public void setMagnitude_aparente(String magnitude_aparente) {
		this.magnitude_aparente = magnitude_aparente;
	}

	public Double getMetalicidade() {
		return metalicidade;
	}

	public void setMetalicidade(Double metalicidade) {
		this.metalicidade = metalicidade;
	}

	public String getAdjetivo() {
		return adjetivo;
	}

	public void setAdjetivo(String adjetivo) {
		this.adjetivo = adjetivo;
	}

	public String getRaio_equatorial() {
		return raio_equatorial;
	}

	public void setRaio_equatorial(String raio_equatorial) {
		this.raio_equatorial = raio_equatorial;
	}

	public Double getObliquidade() {
		return obliquidade;
	}

	public void setObliquidade(Double obliquidade) {
		this.obliquidade = obliquidade;
	}

	public String getDeclinacao() {
		return declinacao;
	}

	public void setDeclinacao(String declinacao) {
		this.declinacao = declinacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
