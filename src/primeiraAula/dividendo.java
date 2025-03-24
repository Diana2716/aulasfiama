package primeiraAula;

import java.util.Scanner;

public class dividendo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Digite o primeiro número (dividendo)");
			double dividendo = sc.nextDouble();
			
			System.out.print("Digite o primeiro número (divisor)");
			double divisor = sc.nextDouble();
			
			if (divisor == 0) {
				
			System.out.println("Erro: divisão por zero não é permitida.");
			
		} else {
				double resultado = dividendo / divisor;
				
				System.out.println("Resultado: " + resultado);
			} 
		} catch (Exception e) {
			
			System.out.println("Erro: entrada inválida. Certifique-se de digitar números.");
		} finally {
			sc.close();
			
	
		}

	}

}
