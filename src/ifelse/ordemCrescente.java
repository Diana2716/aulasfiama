package ifelse;

import java.util.Scanner;

public class ordemCrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeiro número: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Segundo número: ");
		int numero2 = sc.nextInt();
		
		System.out.println("Terceiro número: ");
		int numero3 = sc.nextInt();
		
		 // Lógica para ordenar os números em ordem crescente
        if (numero1 > numero2) {
            // Troca de número 1 e número 2
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        
        if (numero2 > numero3) {
            // Troca de número 2 e número 3
            int temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }
        
        if (numero1 > numero2) {
            // Troca de número 1 e número 2 novamente, se necessário
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        
        // Imprimindo os números em ordem crescente
        System.out.println("Os números em ordem crescente são: " + numero1 + ", " + numero2 + ", " + numero3);
        
        sc.close();
	}

}
