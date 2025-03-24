package aula4;

import java.util.Scanner;

public class ConversorFahrenheitParaCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Solicita ao usuário a temperatura em Fahrenheit
		
		System.out.print("Temperatura em graus Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		
		// Converter para Celsius
		
		double celsius = ((fahrenheit - 32) * 5) / 9;
		
		// Exibe o resultado
		
		System.out.println("A temperatura em celsius é: " + celsius);
		
		sc.close();

	}

}
