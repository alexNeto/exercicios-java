package lista_3;

public class Exercicio_5 {

	public static void exercicio() {

		int[] numeros = new int[1000];
		int j = 0;
		for (int i = 2; i < numeros.length; i++) {
			if (primos(i)) {
				numeros[j] = i;
				j++;
			}
		}
		imprime(numeros);
	}

	public static boolean primos(int i) {
		for (int j = 2; j < i - 1; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void imprime(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if(i % 10 == 0) {
				System.out.println();
			}
			if (numeros[i] == 0) {
				break;
			}
			System.out.printf("%3d ", numeros[i]);
		}
		System.out.println();
	}
}
