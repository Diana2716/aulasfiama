package primeiraAula;

import java.util.Scanner;

public class troco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Leitura dos dados
		
		System.out.print("Preço unitário do produto: ");
		double precoUnitario = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		int quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		double dinheiroRecebido = sc.nextDouble();
		
		// Cálculo do custo total e troco
		
		double custoTotal = precoUnitario * quantidade;
		double troco = dinheiroRecebido - custoTotal;
		
		// Exibição do resultado
		
		System.out.printf("TROCO = %.2f%n", troco);
		
		sc.close();
		
		

	}

}
