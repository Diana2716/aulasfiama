package primeiraAula;

import java.util.Scanner;

public class pisocalculador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// entrada de dados
		System.out.print("Digite a largura do cômodo: ");
		double largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento do cômodo: ");
		double comprimento = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado do piso: ");
		double valorMetroQuadrado = sc.nextDouble();
		
		// Cálculo da área do cômodo
		double areaComodo = largura * comprimento;
		
		// Cálculo do custo total do piso
		double custoTotal = areaComodo * valorMetroQuadrado;
		
		// Exibição dos resultados com duas casas decimais
		System.out.print(String.format("%.2f\n", areaComodo));
		System.out.print(String.format("%.2f\n", custoTotal));
		
		sc.close();
		
	}
}
