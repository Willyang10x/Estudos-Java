import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		/*int valor = 0;
		valor = s.nextInt();
		System.out.println(valor);
		if (valor > 10 && valor < 20) {
			System.out.println("VALOR entre 10 e 20");
		}
		else {
			System.out.println("Não está no intervalo");
		}
		
		switch (valor) {
			case 1:
				System.out.println("JANEIRO");
				break;
			case 2:
				System.out.println("FEVEREIRO");
				break;
			case 3:
				System.out.println("MARÇO");
				break;
			case 4:
				System.out.println("Abril");
				break;
			default:
				System.out.println("Nenhum mês mapeado");
				//break;
		}
		
		//s.close(); // liberar recursos */
		
		boolean repete = true;
		while (repete) {
			System.out.println("---- MENU ----");
			System.out.println("1 - Realizar soma");
			System.out.println("2 - Realizar subtração");
			System.out.println("3 - Realizar multiplicação");
			System.out.println("4 - Realizar divisão");
			System.out.println("0 - Sair");
			System.out.println("DIGITE A OPÇÃO: ");
			int opcao = s.nextInt();
			double valor1, valor2;
			switch(opcao) {
			case 1:
				System.out.println("Digite o valor 1: ");
				valor1 = s.nextDouble();
				System.out.println("Digite o valor 2: ");
				valor2 = s.nextDouble();
				System.out.printf("SOMA = %.2f\n", (valor1 + valor2));
				break;
			case 2:
				System.out.println("Digite o valor 1: ");
				valor1 = s.nextDouble();
				System.out.println("Digite o valor 2: ");
				valor2 = s.nextDouble();
				System.out.printf("SUBT = %.2f\n", (valor1 - valor2));
				break;
			case 3:
				System.out.println("Digite o valor 1: ");
				valor1 = s.nextDouble();
				System.out.println("Digite o valor 2: ");
				valor2 = s.nextDouble();
				System.out.printf("MULT = %.2f\n", (valor1 * valor2));
				break;
			case 4:
				System.out.println("Digite o valor 1: ");
				valor1 = s.nextDouble();
				System.out.println("Digite o valor 2: ");
				valor2 = s.nextDouble();
				if (valor2 == 0) {
					System.out.println("DIVISÃO IMPOSSÍVEL");
				}
				else {
					System.out.printf("DIV = %.2f\n", (valor1 / valor2));
				}
				break;
			case 0:
				repete = false;
				break;
			default:
				System.out.println("Opção inválida");
			}
		
			
			
		}
		
		
		
	}

}
