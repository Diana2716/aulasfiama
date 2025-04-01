package fiama;

public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] notas = {8.0, 6.5, 7.0, 2.0, 5.0, 9.0};
		double soma = 0;
		
		for (double nota : notas) {
			soma += nota;
		}
		double media = soma / notas.length;
		
		System.out.println("Notas: ");
		for (double nota : notas) {
			System.out.println(nota + " ");
		}
		System.out.printf("\nMédia: %.2f\n", media);
		System.out.println("Resultado: " + (media >= 7 ? "Aprovado." : "Reprovado."));
   }

}
