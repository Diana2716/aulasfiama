package aula4;

import java.util.Scanner;

public class trocadevalores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//valor da variavél A
		System.out.print("valor de a: ");
		int a = sc.nextInt();
		
		//valor da variavel B
		System.out.print("valor de b: ");
		int b = sc.nextInt();
		
		//Exibindo os valores antes da troca
		
		System.out.println("Antes da troca A = " + a + ", B = " + b);
		
		//Realizando troca de valores
		
		int temp = a;
		a = b;
		b = temp;
		
		//Exibindo os valores após a troca

		System.out.println("Depois da troca A = " + a + ", B = " + b);
		
		sc.close();
	}

}
