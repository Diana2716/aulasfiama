package aula4;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Solicita ao usuário a temperatura em Celsius
		
		System.out.print("Temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		// Converte para Fahrenheit
		double fahrenheit = celsius * 9 / 5 + 32;
		
		// Exibe o resultado
		
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		
		sc.close();
		
		
	}

}
