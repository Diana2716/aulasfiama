package VetoresEmJava;

public class ContandoNumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] vetor = {4, 7, 2, 9, 10, 23, 42, 11, 6, 8, 15, 16, 13, 14, 18};
		
		int contadorPares = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				contadorPares++;
			}
		}
		 System.out.print("Vetor: ");
	        for (int num : vetor) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        System.out.println("Total de números pares: " + contadorPares);
	    }
	}

