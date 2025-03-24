package contagem;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        int numero;

        while (true) {
           
            System.out.print("Digite um número (digite 0 para sair): ");
            numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Você digitou 0. O programa será encerrado.");
                break;
            }

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }
        }

        sc.close();
	}

}
