package lista_1;

public class Exercicio_3 {

	public static void exercicio() {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
	
		System.out.println("Digite cinco números: ");
		
		int[] numeros = new int[5];
		
		for(int i = 0; i < 5; i++)
			numeros[i] = input.nextInt();
	
		int menor = numeros[0];
		int maior = numeros[0];
		for(int i = 0; i < 5; i++) {
			if(numeros[i] < menor)
				menor = numeros[i];
			if(numeros[i] > maior)
				maior = numeros[i];
		}
	
		System.out.printf("\nO menor número é: %d e o maior é %d", menor, maior);
	}
}
