package Exercicios;

import java.util.Scanner;

public class BuscaFeitiço {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] feiticos = {"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o feitiço que deseja buscar: ");
		String alvo = sc.nextLine();
		
		int inicio = 0;
		int fim = feiticos.length - 1;
		boolean encontrado = false;
		
		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;
			int comparacao = alvo.compareToIgnoreCase(feiticos[meio]);
			
			if (comparacao == 0) {
				System.out.println("Feitiço encontrado na posição " + meio);
				encontrado = true;
				break;
			} else if (comparacao < 0) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		if (!encontrado) {
			System.out.println("Feitiço não encontrado.");
		}
		
	}

}
