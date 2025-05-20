package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Jogo {

		// TODO Auto-generated method stub
		
		    static String[] opcoes = {"pedra", "papel", "tesoura", "lagarto", "spock"};

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();

		        System.out.println("=== Pedra, Papel, Tesoura, Lagarto, Spock ===");
		        System.out.println("Escolha uma opção: pedra, papel, tesoura, lagarto ou spock");
		        System.out.print("Você: ");
		        String jogador = scanner.nextLine().toLowerCase();

		        boolean entradaValida = false;
		        for (String opcao : opcoes) {
		            if (opcao.equals(jogador)) {
		                entradaValida = true;
		                break;
		            }
		        }

		        if (!entradaValida) {
		            System.out.println("Opção inválida. Tente novamente.");
		            return;
		        }

		        String computador = opcoes[random.nextInt(opcoes.length)];
		        System.out.println("Computador: " + computador);

		        if (jogador.equals(computador)) {
		            System.out.println("Empate!");
		        } else if (
		            (jogador.equals("tesoura") && (computador.equals("papel") || computador.equals("lagarto"))) ||
		            (jogador.equals("papel") && (computador.equals("pedra") || computador.equals("spock"))) ||
		            (jogador.equals("pedra") && (computador.equals("lagarto") || computador.equals("tesoura"))) ||
		            (jogador.equals("lagarto") && (computador.equals("spock") || computador.equals("papel"))) ||
		            (jogador.equals("spock") && (computador.equals("tesoura") || computador.equals("pedra")))
		        ) {
		            System.out.println("Você venceu!");
		        } else {
		            System.out.println("Computador venceu!");
		        }

		        scanner.close();
		    }
		
		
	}

