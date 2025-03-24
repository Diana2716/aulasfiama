package aula4;

import java.util.Scanner;

public class ConsumoCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Solicita ao usuário o tempo gasto na viagem (em horas)
		
		System.out.print("Tempo gasto na viagem (em horas): ");
		double tempo = sc.nextDouble();
		
		// Solicita ao usuário a velocidade média durante a viagem (em km/h)
		
		System.out.print("Velocidade média durante a viagem (em km/h): ");
		double velocidade = sc.nextDouble();
		
		// Calcula a distância percorrida
		
		double distancia = tempo * velocidade;
		
		// Calcula a quantidade de litros de combustível utilizada
		 
		double litrosUsados = distancia / 12; // O carro faz 12 km por litro
		
		// Exibe os resultados
		
		System.out.println("\n--- Relatório da Viagem ---");
		
		System.out.println("Velocidade Média: " +  velocidade + "km/h");
		
		System.out.println("Tempo Gasto: " + tempo + " horas");
		
		System.out.println("Distância Percorrida: " + distancia + " km");
		
		System.out.println("Combustível Utilizado: " + litrosUsados + " litros");
		
		sc.close();
		
		}

}
