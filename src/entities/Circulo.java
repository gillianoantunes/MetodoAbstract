package entities;

import entities.enums.Cor;

public class Circulo extends Figura {
	private Double raio;
	
	
	public Circulo() {
		super();
	}

	public Circulo(Cor cor,String nome, Double raio) {
		super(cor,nome);
		this.raio = raio;
	}






	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double area() {
		return Math.PI * (raio * raio);
	}

}
