package SituaçãoDesafiadora1;

import java.util.Scanner;

public class SituacaoDesafiadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

		        System.out.print("Informe o salário bruto: R$ ");
		        double salarioBruto = sc.nextDouble();

		        System.out.print("Informe o número de dependentes: ");
		        int dependentes = sc.nextInt();

		        System.out.print("Tipo de plano de saúde (Nenhum, Basico, Avancado): ");
		        String planoSaude = sc.next();

		        System.out.print("Utiliza Vale Transporte? (s/n): ");
		        boolean usaVT = sc.next().equalsIgnoreCase("s");

		        System.out.print("Utiliza Vale Alimentação? (s/n): ");
		        boolean usaVA = sc.next().equalsIgnoreCase("s");

		        System.out.print("Utiliza Vale Refeição? (s/n): ");
		        boolean usaVR = sc.next().equalsIgnoreCase("s");

		        double descontoINSS = calcularINSS(salarioBruto);
		        double baseIR = salarioBruto - descontoINSS - (dependentes * 189.59);
		        double descontoIR = calcularIR(baseIR);
		        double descontoVT = usaVT ? salarioBruto * 0.06 : 0.0;
		        double descontoVA = usaVA ? 200.0 : 0.0;
		        double descontoVR = usaVR ? 250.0 : 0.0;
		        double descontoPlano = 0.0;

		        switch (planoSaude.toLowerCase()) {
		            case "basico":
		                descontoPlano = 150.0;
		                break;
		            case "avancado":
		                descontoPlano = 300.0;
		                break;
		        }

		        double totalDescontos = descontoINSS + descontoIR + descontoVT + descontoVA + descontoVR + descontoPlano;
		        double salarioLiquido = salarioBruto - totalDescontos;
		        double percentualDescontos = (totalDescontos / salarioBruto) * 100;

		        
		        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
		        System.out.printf("Total de Descontos: R$ %.2f (%.2f%%)%n", totalDescontos, percentualDescontos);
		    }

		    private static double calcularINSS(double salario) {
		        if (salario <= 1302.00) return salario * 0.08;
		        else if (salario <= 2571.00) return salario * 0.09;
		        else if (salario <= 3856.00) return salario * 0.11;
		        else if (salario <= 7087.22) return salario * 0.14;
		        else return 570.88;
		    }

		    private static double calcularIR(double base) {
		        if (base <= 1903.98) return 0.0;
		        else if (base <= 2826.65) return base * 0.075 - 142.80;
		        else if (base <= 3751.05) return base * 0.15 - 354.80;
		        else if (base <= 4664.68) return base * 0.225 - 636.13;
		        else return base * 0.275 - 869.36;
		    }
		}