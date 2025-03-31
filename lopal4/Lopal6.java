package lopal4;

import java.util.Scanner;

public class Lopal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos calucular valores iguais de arroz para dividir entre amigos");
		int res = 0;
		
		System.out.println("Quantas gramas de arroz serão divididos? ");
		int gramas = sc.nextInt();
		
		System.out.println("Vai dividir entre quantos amigos? ");
		int amigos = sc.nextInt();
		
		if (amigos == 0 || gramas == 0) {
			System.out.println("Numero de amigos ou gramas de arroz invalido");
		} else {
			res = gramas / amigos;
			System.out.println(res + " gramas de arroz para " + amigos);
		}
	}

}
