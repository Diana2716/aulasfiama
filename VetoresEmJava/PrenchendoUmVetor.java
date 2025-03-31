package VetoresEmJava;

import java.util.Scanner;

public class PrenchendoUmVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		        int[] vetor = new int[5];
		        
		        Scanner scanner = new Scanner(System.in);

		        for (int i = 0; i < 5; i++) {
		            System.out.print("Digite um número: ");
		            vetor[i] = scanner.nextInt();  
		        }
		        System.out.print("Números armazenados: ");
		        for (int i = 0; i < 5; i++) {
		            System.out.print(vetor[i] + " ");  
		        }
		    }
	}
