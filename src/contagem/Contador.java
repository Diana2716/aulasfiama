package contagem;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		while (i < 11) {
			System.out.println("valor:" + i);
			i++;
			
			sc.close();
		}

	}

}
