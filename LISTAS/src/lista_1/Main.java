package lista_1;

public class Main {

	public static void main(String[] args) {

		System.out.println("Escolha um Exercicio:");
		@SuppressWarnings("resource")
		java.util.Scanner input = new java.util.Scanner(System.in);
		while (true) {
			int escolha = input.nextInt();
			int numero1 = 0;
			int numero2 = 0;
			double totalVendaBruta = 00.00;
			double horasTrabalhadas = 00.00;
			double valorPorHora = 00.00;
			int[] numeros = new int[5];
			switch (escolha) {
			case 1:
				System.out.println("EXERCICIO 1");
				System.out.println("Digite um número: ");
				numero1 = input.nextInt();
				System.out.println("Digite outro número: ");
				numero2 = input.nextInt();
				Exercicio_1.exercicio(numero1, numero2);
				break;
			case 2:
				System.out.println("EXERCICIO 2");
				System.out.println("Digite um número: ");
				numero1 = input.nextInt();
				System.out.println("Digite outro número: ");
				numero2 = input.nextInt();
				Exercicio_2.exercicio(numero1, numero2);
				break;
			case 3:
				System.out.println("EXERCICIO 3");
				System.out.println("Digite cinco números: ");

				for (int i = 0; i < 5; i++)
					numeros[i] = input.nextInt();
				Exercicio_3.exercicio(numeros);
				break;
			case 4:
				System.out.println("EXERCICIO 4");
				System.out.println("Digite um número: ");
				numero1 = input.nextInt();
				System.out.println("Digite outro número: ");
				numero2 = input.nextInt();
				Exercicio_4.exercicio(numero1, numero2);
				break;
			case 5:
				System.out.println("EXERCICIO 5");
				Exercicio_5.exercicio();
				break;
			case 6:
				System.out.println("EXERCICIO 6");
				System.out.println("Digite o valor das vendas da semana : ");
				totalVendaBruta = input.nextDouble();
				Exercicio_6.exercicio(totalVendaBruta);
				break;
			case 7:
				System.out.println("EXERCICIO 7");
				System.out.println("Digite a quantidade de horas trabalhadas: ");
				horasTrabalhadas = input.nextDouble();
				System.out.println("Digite o valor da hora: ");
				valorPorHora = input.nextDouble();
				Exercicio_7.exercicio(horasTrabalhadas, valorPorHora);
				break;
			case 8:
				System.out.println("EXERCICIO 8");
				System.out.println("Digite o dado a ser transmitido: ");
				numero1 = input.nextInt();
				Exercicio_8.exercicio(numero1);
				break;
			case 9:
				Exercicio_1.exercicio(numero1, numero2);
				Exercicio_2.exercicio(numero1, numero2);
				Exercicio_3.exercicio(numeros);
				Exercicio_4.exercicio(numero1, numero2);
				Exercicio_5.exercicio();
				Exercicio_6.exercicio(totalVendaBruta);
				Exercicio_7.exercicio(horasTrabalhadas, valorPorHora);
				Exercicio_8.exercicio(numero1);
				break;

			default:
				break;
			}
		}

	}

}
