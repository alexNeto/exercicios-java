package lista_3;


public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		java.util.Scanner input = new java.util.Scanner(System.in);
		int escolha = 0;
		while (true && escolha != 7) {
			System.out.println("Escolha um Exercicio:");
			System.out.printf("1 - Exercicio 1\n" + "2 - Exercicio 2\n" + "3 - Exercicio 3\n" + "4 - Exercicio 4\n"
					+ "5 - Exercicio 5\n" + "6 - Exercicio 6\n" + "7 - Sair\n");
			escolha = input.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("EXERCICIO 1");
				Exercicio_1.exercicio();
				break;
			case 2:
				System.out.println("EXERCICIO 2");
				int[] quantidade = new int[5];
				for (int i = 0; i < 5; i++) {
					System.out.println("Quantidade de P" + (i + 1) + " vendidos");
					quantidade[i] = input.nextInt();
				}
				Exercicio_2.exercicio(quantidade);
				break;
			case 3:
				System.out.println("EXERCICIO 3");
				System.out.println("Digite o tempo que o cliente ficou estacionado.");
				System.out.println("Utilize o formato HH:MM");
				String tempo = input.next();
				Exercicio_3.exercicio(tempo);
				break;
			case 4:
				System.out.println("EXERCICIO 4");
				System.out.println("Digite o primeiro numero");
				int numero1 = input.nextInt();
				System.out.println("Digite o segundo numero");
				int numero2 = input.nextInt();
				Exercicio_4.exercicio(numero1, numero2);
				break;
			case 5:
				System.out.println("EXERCICIO 5");
				Exercicio_5.exercicio();
				break;
			case 6:
				System.out.println("EXERCICIO 6");
				Exercicio_6.exercicio();
				break;

			default:
				break;
			}
		}

	}

}
