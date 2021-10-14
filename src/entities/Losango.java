package entities;

import entities.enums.Cor;

public class Losango extends Figura {
	private Double diagonalmenor;
	private Double diagonalmaior;
	
	public Losango() {
		super();
	}



	public Losango(Cor cor,String nome, Double diagonalmenor, Double diagonalmaior) {
		super(cor,nome);
		this.diagonalmenor = diagonalmenor;
		this.diagonalmaior = diagonalmaior;
	}



	public Double getDiagonalmenor() {
		return diagonalmenor;
	}

	public void setDiagonalmenor(Double diagonalmenor) {
		this.diagonalmenor = diagonalmenor;
	}

	public Double getDiagonalmaior() {
		return diagonalmaior;
	}

	public void setDiagonalmaior(Double diagonalmaior) {
		this.diagonalmaior = diagonalmaior;
	}

	@Override
	public Double area() {
		return (diagonalmenor * diagonalmaior)/2;
	}
	
	
	
}
