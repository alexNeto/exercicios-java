package lista_1;

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
			}
			else {
				System.out.println("Limite insuficiente para cliente nº " + clientes[i].getNumeroConta());
			}
		}
	}
}

class Cliente {

	private int numeroConta;
	private double saldoInicioMes;
	private double totalItensMes;
	private double totalCreditoMes;
	private double limite;
	private double novoSaldo;
	
	public Cliente() {}
	public Cliente(int numeroConta, double saldoInicioMes,
			double totalItensMes, double totalCreditoMes, double limite) {
		this.numeroConta = numeroConta;
		this.saldoInicioMes = saldoInicioMes;
		this.totalItensMes = totalItensMes;
		this.totalCreditoMes = totalCreditoMes;
		this.limite = limite;
		
	}
	public boolean verificaLimite() {
		if((this.saldoInicioMes + this.totalItensMes) < this.limite)
			return true;
		return false;	
	}
	public void setNovoSaldo() {
		this.novoSaldo = saldoInicioMes + totalItensMes - totalCreditoMes;
		System.out.println("Compra realizada com sucesso  para cliente nº " + numeroConta);
	}
	public double getNovoSaldo() {
		return novoSaldo;
	}
	public double getNumeroConta() {
		return numeroConta;
	}
}
