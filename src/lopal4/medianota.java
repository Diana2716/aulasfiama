package lopal4;

import java.util.Scanner;

public class medianota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		 double nota1Objetiva = 8.5, nota1Discursiva = 9.0;
	        double nota2Objetiva = 7.0, nota2Discursiva = 8.0;
	        double nota3Objetiva = 9.0, nota3Discursiva = 9.5;
	        double nota4Objetiva = 6.0, nota4Discursiva = 7.0;
	        double nota5Objetiva = 8.0, nota5Discursiva = 8.5;

	        double somaNotasObjetivas = nota1Objetiva + nota2Objetiva + nota3Objetiva + nota4Objetiva + nota5Objetiva;
	        double somaNotasDiscursivas = nota1Discursiva + nota2Discursiva + nota3Discursiva + nota4Discursiva + nota5Discursiva;

	        double mediaObjetiva = somaNotasObjetivas / 5;
	        double mediaDiscursiva = somaNotasDiscursivas / 5;

	        System.out.println("Média das notas objetivas: " + mediaObjetiva);
	        System.out.println("Média das notas discursivas: " + mediaDiscursiva);
	        
	        scanner.close();
	}
}
