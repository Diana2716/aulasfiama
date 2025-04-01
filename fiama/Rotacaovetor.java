package fiama;

public class Rotacaovetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = {1, 2, 3, 4, 5};
		
		System.out.println("Vetor original: ");
		for (int num : vetor) {
			System.out.println(num + " ");
		}
		int ultimo = vetor[vetor.length - 1];
		for (int i = vetor.length - 1; i > 0; i--) {
			vetor[i] = vetor[i - 1];
		}
		vetor[0] = ultimo;
		
		System.out.println("\nVetor rotacionado: ");
		for (int num : vetor) {
			System.out.println(num + " ");
		}
	}

}
