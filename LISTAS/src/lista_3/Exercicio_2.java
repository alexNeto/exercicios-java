package lista_3;

import lista_3.dependencias.exercicio_2.Vendas;

public class Exercicio_2 {
	
	private static final int J = 5;

	public static void exercicio(int[] quantidade) {
			
		Vendas venda = new Vendas();
		
		for(int i = 0; i < J; i++) {
			venda.compraRealizada(i, quantidade[i]);
		}
		System.out.printf("Total R$: %.2f\n", venda.getTotalPreco());
		System.out.println("Sendo\n");
		double[] porcentagem = venda.getProcentagem();
		for(int i = 0; i < J; i++) {
			System.out.printf("%.2f%% - P%d\n", porcentagem[i], i + 1);
		}
	}

}
