package lista_3;

public class Exercicio_4 {

	public static void exercicio(int numero1, int numero2) {
		boolean divVerificada = multiplo(numero1, numero2);
		System.out.printf("Os numeros %d e %d ", numero1, numero2);
		System.out.printf((divVerificada == true ) ? "são divisiveis\n" : "não são divisiveis\n");
	}
	public static boolean multiplo(int numero1, int numero2) {
		if(numero1 % numero2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
