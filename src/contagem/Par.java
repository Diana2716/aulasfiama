package contagem;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o número limite para a contagem: ");
	        int limite = sc.nextInt();
	        for (int i = 0; i <= limite; i++) {
	            if (i % 2 == 0) { 
	                System.out.println(i);
	            }
	        }
	        sc.close();
	}

}
