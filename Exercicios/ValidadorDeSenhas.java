package Exercicios;
import java.util.Scanner;

public class ValidadorDeSenhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        boolean temMaiuscula = false;
        boolean temPrimo = false;
        boolean temEspecial = false;
        boolean vogalDuplicada = false;

        String especiais = "!@#$%¨&*()_+-=[]{}|;:',.<>?/";
        String primos = "2357";
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }

            if (Character.isDigit(c) && primos.indexOf(c) != -1) {
                temPrimo = true;
            }

            if (especiais.indexOf(c) != -1) {
                temEspecial = true;
            }

            if (i > 0) {
                char anterior = senha.charAt(i - 1);
                if (vogais.indexOf(c) != -1 && c == anterior) {
                    vogalDuplicada = true;
                }
            }
        }

        if (temMaiuscula && temPrimo && temEspecial && !vogalDuplicada) {
            System.out.println("Senha VÁLIDA");
        } else {
            System.out.println("Senha INVÁLIDA");
        }
    }
}