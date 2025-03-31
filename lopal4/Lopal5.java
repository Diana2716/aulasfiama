package lopal4;

import java.util.Scanner;

public class Lopal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int res = 0;
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < 5 ; i++) {
			num++;
			res = num * 2;
		}
		
		System.out.println(res);
	}

}
