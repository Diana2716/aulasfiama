package lopal4;

import java.util.Scanner;

public class Lopal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota do estudante: ");
		int nota = sc.nextInt();
		
		if (nota > 7) {
			 System.out.println("Estudante com nota " + nota + " está aprovado");
		} else if (nota > 3) {
			System.out.println("Estudante com nota " + nota + " está em recuperação");
		} else {
			System.out.println("Estudante com nota " + nota + " está reprovado");
			
			sc.close();
		}
	}

}
