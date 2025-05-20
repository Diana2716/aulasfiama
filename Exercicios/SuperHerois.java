package Exercicios;

import java.util.Scanner;

public class SuperHerois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro Super Herói que deseja criar: ");
		System.out.println("Nome: ");
		String nome1 = sc.nextLine();
		System.out.println("Força: ");
		int forca1 = sc.nextInt();
		System.out.println("Inteligência: ");
		int inteligencia1 = sc.nextInt();
		System.out.println("Velocidade: ");
		int velocidade1 = sc.nextInt();
		sc.nextLine();
		
		int poder1 = forca1 + inteligencia1 + velocidade1;
		
		System.out.println("Digite os dados do segundo Super Herói que deseja criar: ");
		System.out.println("Nome: ");
		String nome2 = sc.nextLine();
		System.out.println("Força: ");
		int forca2 = sc.nextInt();
		System.out.println("Inteligência: ");
		int inteligencia2 = sc.nextInt();
		System.out.println("Velocidade: ");
		int velocidade2 = sc.nextInt();
		sc.nextLine();
		
		int poder2 = forca2 + inteligencia2 + velocidade2;
		
		System.out.println("\nPoder total de " + nome1 + ": " + poder1);
		System.out.println("\nPoder total de " + nome2 + ": " + poder2);
		
		if (poder1 > poder2) {
			System.out.println(nome1 + " é mais poderoso!");
		} else if (poder2 > poder1) {
			System.out.println(nome2 + " é mais poderoso!");
		} else {
			System.out.println("Os dois Heróis tem o mesmo poder!");
		}
	}
}