package VetoresEmJava;

public class InvertendoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] vetor = {3, 7, 1, 9, 4, 2};
		
		System.out.println("Vetor original: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
		System.out.println();
		
		System.out.println("Vetor invertido: ");
		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.println(vetor[i] + " ");
		}
	}

}

