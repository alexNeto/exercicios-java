package lista_1;

public class Main {

	public static void main(String[] args) {

		System.out.println("Escolha um Exercicio:");
		java.util.Scanner input = new java.util.Scanner(System.in);
		int escolha = input.nextInt();
		switch (escolha) {
		case 1:
			Exercicio_1.exercicio();
			break;
		case 2:
			Exercicio_2.exercicio();
			break;
		case 3:
			Exercicio_3.exercicio();
			break;
		case 4:
			Exercicio_4.exercicio();
			break;
		case 5:
			Exercicio_5.exercicio();
			break;
		case 6:
			//Exercicio_6.exercicio();
			break;
		case 7:
			//Exercicio_7.exercicio();
			break;
		case 8:
			//Exercicio_8.exercicio();
			break;
		case 9:
			Exercicio_1.exercicio();
			Exercicio_2.exercicio();
			Exercicio_3.exercicio();
			Exercicio_4.exercicio();
			Exercicio_5.exercicio();
			//Exercicio_6.exercicio();
			//Exercicio_7.exercicio();
			//Exercicio_8.exercicio();
			break;

		default:
			break;
		}

	}

}
