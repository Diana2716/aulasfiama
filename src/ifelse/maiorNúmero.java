package ifelse;

import java.util.Scanner;

public class maiorNúmero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Solicita o usuário dois números
		
		System.out.print("Primeiro número: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Segundo número: ");
		int numero2 = sc.nextInt();
		
		//Verifica qual número é maior e imprime o resultado
		
		if (numero1 > numero2) {
			 System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os dois números são iguais.");
        }
		
		sc.close();
	}

}
