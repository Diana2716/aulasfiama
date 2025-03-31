package VetoresEmJava;

import java.util.Random;

public class SomaElementos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vetor = new int [10];
		
		 Random random = new Random();
	        
		 int soma = 0;
		 
		 System.out.println("Números gerados: ");
		 for (int i = 0; i < 10; i++) {
			 vetor[i] = random.nextInt(100) + 1;
			 System.out.println(vetor[i] + " ");
			 soma += vetor[i];
		 }
		 System.out.println("\nSoma total: " + soma);
	}

}
