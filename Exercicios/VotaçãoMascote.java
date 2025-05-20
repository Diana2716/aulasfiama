package Exercicios;

import java.util.Scanner;

public class VotaçãoMascote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String mascote1 = "Pantera";
		String mascote2 = "Tigre";
		String mascote3 = "Leão";
		
		int votos1 = 0;
		int votos2 = 0;
		int votos3 = 0;
		
		System.out.println("==== Votação para o Mascote da Turma ====");
		System.out.println("Digite o Nome do Mascote para votar (ou 'fim' para encerrar): ");
		System.out.println("Opções: " + mascote1 + ", " + mascote2 + ", " + mascote3);
		
		while (true) {
			System.out.println("Seu voto: ");
			String voto = sc.nextLine();
			
			if (voto.equalsIgnoreCase("fim")) {
				break;
			} else if (voto.equalsIgnoreCase(mascote1)) {
				votos1++;
			} else if (voto.equalsIgnoreCase(mascote2)) {
				votos2++;
			} else if (voto.equalsIgnoreCase(mascote3)) {
				votos3++;
			} else {
				System.out.println("Mascote invalido. Tente novamente. ");
			}
		}
		int total = votos1 + votos2 + votos3;
		
		System.out.println("\n=== Resultado da Votação ===");
		if (total == 0) {
			System.out.println("Nenhum voto foi registrado.");
		} else {
			System.out.println(mascote1 + ": " + votos1 + "votos (" + (votos1 * 100 / total) + "%)");
			System.out.println(mascote2 + ": " + votos2 + "votos (" + (votos2 * 100 / total) + "%)");
			System.out.println(mascote3 + ": " + votos3 + "votos (" + (votos3 * 100 / total) + "%)");
		}
	}
}
