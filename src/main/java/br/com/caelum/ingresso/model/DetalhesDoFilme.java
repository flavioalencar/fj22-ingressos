package br.com.caelum.ingresso.model;

public class DetalhesDoFilme {
	@JsonProperty("Title")
	private String titulo;
	
	@JsonProperty("Year")
	private String ano;
	
	@JsonProperty("Poster")
	private String imagem;
	
	@JsonProperty("Director")
	private String diretores;
	
	@JsonProperty("Writer")
	private String escritores;
	
	@JsonProperty("Actors")
	private String atores;
}
