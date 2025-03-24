package lopal4;

import java.util.Scanner;

public class um {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		
        double nota = sc.nextDouble();
        
        if (nota > 7 ) {
        	System.out.println("O estudante esta aprovado.");
        } else if (nota >= 4 && nota <= 7) {
        	System.out.println("O estudante esta em recuperação.");
        } else {
        	System.out.println("O estudante esta em reprovado.");
        }
        sc.close();
	}
}
