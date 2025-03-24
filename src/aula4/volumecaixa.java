package aula4;

import java.util.Scanner;

public class volumecaixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Comprimento, largura e altura da caixa
		
		System.out.print("comprimento da caixa: ");
		double comprimento = sc.nextDouble();
		
		System.out.print("largura da caixa: ");
		double largura = sc.nextDouble();
		
		System.out.print("altura da caixa: ");
		double altura = sc.nextDouble();
		
		//Calculando o volume da caixa
		
		double volume = comprimento * largura * altura;
		
		//Exibindo resultado
		
		System.out.printf("o volume d caixa retangular é: %.2f\n", volume);
		
		sc.close();
	}

}
