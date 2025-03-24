package lopal4;

import java.util.Scanner;

public class divisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para dividir:");
		int divisor = sc.nextInt();
		
		System.out.println("Digite o dividendo:");
		int dividendo = sc.nextInt();
		
		if (divisor == 0 ) {
			System.out.println("Erro: Não é possivel dividir por zero.");
		} else {
			int resultado = dividendo / divisor;
			System.out.println("O resultado é:" + resultado);
			
				sc.close();
			}
		}
	}
