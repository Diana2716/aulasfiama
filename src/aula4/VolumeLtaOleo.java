package aula4;

import java.util.Scanner;

public class VolumeLtaOleo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Solicitar ao usuário o raio da base da lata
		
		System.out.print("Raio da base da lata (em cm): ");
		double raio = sc.nextDouble();
		
		// Solicitar ao usuário a altura da lata
		
		System.out.print("Altura da lata (em cm): ");
		double altura = sc.nextDouble();
		// Cálcula o volume da lata
		double volume = 3.14159 * Math.pow(raio, 2) * altura;
		
		// Exibe o resultado
		
		System.out.println("O volume da lata de óleo é: " + volume + "cm³");
		
		sc.close();

	}

}
