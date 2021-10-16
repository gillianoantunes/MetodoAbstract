package application;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Figura;
import entities.Losango;
import entities.Quadrado;
import entities.enums.Cor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Figura> lista = new ArrayList<>();

		System.out.println("Digite o número de figuras:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Quadrado, Círculo ou Losango(q/c/l)?");
			sc.nextLine();
			char tipo = sc.next().charAt(0);
			
			System.out.println("Digite a cor:VERMELHO/AZUL/VERDE/AMARELO:");
			// para receber enum declare a variavel do tipo enum
			// nomedavarivael.valueOf( o que foi digitado)
			Cor cor = Cor.valueOf(sc.next());
			
			System.out.println("Dados da figura" + i);
			if (tipo == 'q') {
				System.out.println("altura:");
				Double altura = sc.nextDouble();
				System.out.println("Largura:");
				Double largura = sc.nextDouble();
				Quadrado quadrado = new Quadrado(cor,"Quadrado",altura, largura);
				lista.add(quadrado);
			} else {
				if (tipo == 'c') {
					 System.out.println("raio:");
					Double raio = sc.nextDouble();
					Circulo circulo = new Circulo(cor,"Círculo",raio);
					lista.add(circulo);
				} else {
					if (tipo == 'l') {
						System.out.println("diagonal menor:");
						Double digmenor = sc.nextDouble();
						System.out.println("diagonal maior:");
						Double digmaior = sc.nextDouble();
						Losango losango = new Losango(cor,"Losango",digmenor, digmaior);
						lista.add(losango);
					}
				}
			}
		}
		System.out.println("Áreas das figuras: \n");
		for (Figura f : lista) {
			System.out.println(f.getNome() +
					"Cor: " + f.getCor() + 
					 " Área: " + String.format("%.2f", f.area())+ "\n");
			
		}
		sc.close();
	}

}
