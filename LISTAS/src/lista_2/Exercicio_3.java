package lista_2;

public class Exercicio_3 {

	public static void exercicio(int[] numeros) {
			
	
		int menor = numeros[0];
		int maior = numeros[0];
		for(int i = 0; i < 5; i++) {
			if(numeros[i] < menor)
				menor = numeros[i];
			if(numeros[i] > maior)
				maior = numeros[i];
		}
	
		System.out.printf("\nO menor número é: %d e o maior é %d\n", menor, maior);
	}
}
