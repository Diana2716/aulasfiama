package lopal4;

import java.util.Scanner;

public class NumeroValido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        
	        if ((numero > 10 && numero < 20) || (numero > 30 && numero < 40)) {
	            System.out.println("O número " + numero + " é válido.");
	        } else {
	            System.out.println("O número " + numero + " não é válido.");
	        }
	        
	        scanner.close();
	    }
	}

