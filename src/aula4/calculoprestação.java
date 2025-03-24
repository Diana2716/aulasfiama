package aula4;

import java.util.Scanner;

public class calculoprestação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//Solicita ao usuário um valor do bem
		
		System.out.println("valor do bem: ");
		double valor = sc.nextDouble();
		
		//Solicita ao usuário a taxa de juros
		
		System.out.println("taxa de juros (em %): ");
		double taxa = sc.nextDouble();
		
		//Solicita ao usuário o tempo de atraso
		
		System.out.println("tempo de atraso (em meses): ");
		int tempo = sc.nextInt();
		
		//Calculando a prestasão
		
		double prestacao = valor + (valor * (taxa / 100 ) * tempo);
		
		//Exibindo resultado
		
		System.out.printf("o valor da prestação com atraso é: %.2f\n", prestacao);
		
		sc.close();
	}

}
