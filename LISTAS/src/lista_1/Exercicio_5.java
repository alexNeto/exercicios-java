package lista_1;

public class Exercicio_5 {

	public static void exercicio() {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int numero1 = input.nextInt();
		System.out.println("Digite outro n�mero: ");
		int numero2 = input.nextInt();

		System.out.println((numeros1 % numero2 == 0) ? "� divisivel" : "n�o � divisivel");
	}
}
