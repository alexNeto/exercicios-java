package lista_1;

public class Exercicio_1 {

	public static void exercicio() {

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero1 = input.nextInt();
		System.out.println("Digite outro número: ");
		int numero2 = input.nextInt();

		System.out.printf("\nA soma é %d\n", numero1 + numero2);
		System.out.printf("A subtração é %d\n", numero1 - numero2);
		System.out.printf("A multiplicação é %d\n", numero1 * numero2);
		System.out.println((numero2 == 0) ? "Divisão por 0 não é permitido" : "A divisão é %.2f" + (numero1 / (double)numero2));

	}
}
