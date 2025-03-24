package contagem;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite um número para calcular o fatorial: ");
	        int numero = sc.nextInt();
	        int fatorial = 1;
	        if (numero >= 0) {
	            for (int i = 1; i <= numero; i++) {
	                fatorial *= i; 
	            }
	            System.out.println("O fatorial de " + numero + " é: " + fatorial);
	        } else {
	            System.out.println("O fatorial não é definido para números negativos.");
	        }
	        
	        sc.close();

	}

}
