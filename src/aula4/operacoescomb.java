package aula4;

import java.util.Scanner;

public class operacoescomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//Valores das variaveis A, B, C e D
		
		System.out.print("valor de A: ");
		int a = sc.nextInt();
		
		System.out.print("valor de B: ");
		int b = sc.nextInt();
		
		System.out.print("valor de C: ");
		int c = sc.nextInt();
		
		System.out.print("valor de D: ");
		int d = sc.nextInt();
		
		 // Exibindo as adições
        System.out.println("Resultados das adições:");
        System.out.println("A + B = " + (a + b));
        System.out.println("A + C = " + (a + c));
        System.out.println("A + D = " + (a + d));
        System.out.println("B + C = " + (b + c));
        System.out.println("B + D = " + (b + d));
        System.out.println("C + D = " + (c + d));
        
     // Exibindo as multiplicações
        System.out.println("\nResultados das multiplicações:");
        System.out.println("A * B = " + (a * b));
        System.out.println("A * C = " + (a * c));
        System.out.println("A * D = " + (a * d));
        System.out.println("B * C = " + (b * c));
        System.out.println("B * D = " + (b * d));
        System.out.println("C * D = " + (c * d));
        
        sc.close();
	}

}
