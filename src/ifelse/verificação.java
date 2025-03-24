package ifelse;

import java.util.Scanner;

public class verificação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Nota do aluno
		System.out.print("Nota do aluno: ");
		double nota = sc.nextDouble();
		
		//Verifique se a nota é igual ou maior que 7
		
		if (nota >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
			
			sc.close();
		}

	}

