package entities;

import entities.enums.Cor;

public abstract class Figura {
	//cor � enum
	private Cor cor;
	private String nome;
	
	public Figura() {
	
	}

	public Figura(Cor cor, String nome) {
		this.cor = cor;
		this.nome = nome;
	}
	

	public Cor getCor() {
		return cor;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}


	public void setCor(Cor cor) {
		this.cor = cor;
	}


	//metodo abstract sem implementa��o coloca o ponto e virgula sem abrir chaves
	//Se o metodo � abstrato tem que por na classe tambem a palvra abstrata
	public abstract Double area();
}
