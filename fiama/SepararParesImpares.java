package fiama;

public class SepararParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = {12, 3, 7, 8, 9, 10, 14, 5, 18, 21};
		String pares = "";
		String impares = "";
		
		for (int num : vetor) {
			if (num % 2 == 0) {
				pares += num + " ";
			} else {
				impares += num + " ";
			}
		}
		System.out.println("Vetor original: ");
		for (int num : vetor) {
			System.out.println(num + " ");
		}
		System.out.println("\nNúmeros pares: " + pares);
		System.out.println("\nNúmeros impares: " + impares);
	}

}
