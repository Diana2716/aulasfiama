package fiama;

import java.util.Scanner;

public class ComparacaoVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		System.out.println("5 números para o vetor A: ");
		for (int i = 0; i < 5; i++) {
			vetorA[i] = sc.nextInt();
		}
		System.out.println("5 númeors para o vetor B: ");
		for (int i = 0; i < 5; i++) {
			vetorB[i] = sc.nextInt();
		}
		System.out.println("Números iguais nas mesmas posições: ");
		for (int i = 0; i < 5; i++) {
			if (vetorA[i] == vetorB[i]) {
				System.out.println("Posição " + (i + 1) + ": " + vetorA[i]);
			}
		}
		sc.close();
	}

}
