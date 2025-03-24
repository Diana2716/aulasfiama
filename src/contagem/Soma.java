package contagem;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número até onde deseja contar: ");
	        int numero = sc.nextInt();
	        int soma = 0;
	        for (int i = 1; i <= numero; i++) {
	            soma += i;
	        }
	        
	        System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);
	        sc.close();
	}

}
