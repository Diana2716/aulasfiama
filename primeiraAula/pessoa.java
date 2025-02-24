package primeiraAula;

import java.util.Scanner;

public class pessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Leitura dos dados da primeira pessoa
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		String nome1 = sc.nextLine();
		System.out.print("Altura: ");
		double altura1 = sc.nextDouble();
		sc.nextLine(); // Consumir a quebra de linha
		
		//Leitura dos dados da segunda pessoa
		
		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		String nome2 = sc.nextLine();
		System.out.print("Altura: ");
		double altura2 = sc.nextDouble();
		
		// Cálculo da altura média
		
		double alturaMedia = (altura1 + altura2 / 2);
		
		// Exibição do resultado formatado com uma casa decimal
		
		System.out.printf("A altura media de %s e %s é de %.1f metros. %n", nome1, nome2, alturaMedia);
		 sc.close();
		
	}

}
