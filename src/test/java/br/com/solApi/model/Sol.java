package br.com.solApi.model;

public class Sol {
  
	private Integer id;
	private String magnitude_aparente;
	private Double metalicidade;
	private String adjetivo;
	private String raio_equatorial;
	private Double obliquidade;
	private String declinacao;
	private String tipo;
	
	public Sol() {
		// TODO Auto-generated constructor stub
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
