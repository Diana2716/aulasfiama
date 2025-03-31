package VetoresEmJava;

public class MaiorMenorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[] vetor = {5, 3, 9, 1, 7, 8, 4, 2};
		 int maior = vetor[0];
		 int menor = vetor[0];
		 
		 for (int i = 1; i < vetor.length; i++) {
			 if (vetor[i] > maior) {
				 maior = vetor[i];
			 }
	         if (vetor[i] < menor) {
	        	 menor = vetor[i];
	         }
		 }
		 
		 System.out.println("Vetor: ");
		 for (int num : vetor) {
			 System.out.println(num + " ");
		 }
		 System.out.println();
		 System.out.println("Maior número: " + maior);
		 System.out.println("Menor número: " + menor);
	}
}
