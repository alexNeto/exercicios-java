package lista_2;

import lista_2.dependencias.Cliente;

public class Exercicio_5 {

	public static void exercicio() {

		Cliente[] clientes = new Cliente[10];
		int[] numeroConta = new int[10];
		double[][] dadosConta = { // {saldoInicioMes, totalItensMes, totalCreditoMes, limite}
				{ 1000.00, 300.00, 100.00, 2000.00 }, { 1000.00, 300.00, 100.00, 2000.00 },
				{ 1000.00, 300.00, 100.00, 2000.00 }, { 1000.00, 300.00, 100.00, 2000.00 },
				{ 1000.00, 300.00, 100.00, 2000.00 }, { 1000.00, 300.00, 100.00, 2000.00 },
				{ 1000.00, 300.00, 100.00, 2000.00 }, { 1000.00, 300.00, 100.00, 2000.00 },
				{ 1000.00, 400.00, 100.00, 1000.00 }, { 1000.00, 300.00, 100.00, 2000.00 } };
		for (int i = 0; i < clientes.length; i++) {
			numeroConta[i] = i + 1;
			clientes[i] = new Cliente(numeroConta[i], dadosConta[i][0], dadosConta[i][1], dadosConta[i][2],
					dadosConta[i][3]);
		}
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].verificaLimite() == true) {
				clientes[i].setNovoSaldo();
				System.out.println("Novo saldo de: " + clientes[i].getNovoSaldo());
			} else {
				System.out.println("Limite insuficiente para cliente nº " + clientes[i].getNumeroConta());
			}
		}
	}
}
