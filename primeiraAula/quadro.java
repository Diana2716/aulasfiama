package primeiraAula;

import java.util.Scanner;

public class quadro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new  Scanner(System.in);
		
		// Leitura das dimensões do quadro
		
		System.out.print("Largura do quadro: ");
		double largura = sc.nextDouble();
		System.out.print("Altura do quadro: ");
		double altura = sc.nextDouble();
		
		// Cálculo da área, perímetro e diagonal
		
		double area = largura * altura;
		double perimetro = 2 * (largura + altura);
		double diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
		
		// Exibição dos resultados com 4 casas decimais 
		
		System.out.printf("ÁREA = %.4f%n", area);
		System.out.printf("PERÍMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();
		
	}

}
