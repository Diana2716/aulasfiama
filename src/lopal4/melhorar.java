package lopal4;

import java.util.Scanner;

public class melhorar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		
        double nota1 = solicitarNota(scanner, 1);
        double nota2 = solicitarNota(scanner, 2);
        double nota3 = solicitarNota(scanner, 3);

        double media = calcularMedia(nota1, nota2, nota3);

        exibirResultado(media);

        scanner.close();
    }

    private static double solicitarNota(Scanner scanner, int numeroNota) {
        System.out.print("Digite a nota " + numeroNota + ": ");
        return scanner.nextDouble();
    }

    private static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    private static void exibirResultado(double media) {
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado! Média: " + media);
        }
    }
	}
