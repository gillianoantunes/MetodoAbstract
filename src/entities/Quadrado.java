package entities;

import entities.enums.Cor;

//da erro no inicio para sobreescrever o metodo area
//clique onde esta o erro na palavra Quadrado e crie o metodo area

public class Quadrado extends Figura {
	private Double altura;
	private Double largura;
	
	
	public Quadrado() {
		super();
	}




	public Quadrado(Cor cor,String nome, Double altura, Double largura) {
		super(cor,nome);
		this.altura = altura;
		this.largura = largura;
	}




	public Double getAltura() {
		return altura;
	}


	public void setAltura(Double altura) {
		this.altura = altura;
	}


	public Double getLargura() {
		return largura;
	}


	public void setLargura(Double largura) {
		this.largura = largura;
	}


	// metodo sobreposto onde area é abstrata na classe figura
	@Override
	public Double area() {
		return largura * altura;
	}

}
