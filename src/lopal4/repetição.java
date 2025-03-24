package lopal4;

import java.util.Scanner;

public class repetição {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int numero = 2;
		int resultado = numero;
		
		  for (int i = 1; i <= 5; i++) {
			resultado += numero;
			resultado *= 2;
			
			System.out.println("O resultado final é:" + resultado);
			sc.close();
		}
	}

}
