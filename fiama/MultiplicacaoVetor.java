package fiama;

import java.util.Scanner;

public class MultiplicacaoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] vetor = {2, 4, 6, 8, 10};
		
		System.out.println("Digite um número para multiplicar: ");
		int multiplicador = sc.nextInt();
		
		System.out.println("Novo Vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] *= multiplicador;
			System.out.println(vetor[i] + " ");
		}
		sc.close();
	}

}
