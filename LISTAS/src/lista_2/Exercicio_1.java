package lista_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Exercicio_1 {

	public static void exercicio() {
		Aplicacao.aplicacao();
	}
}

class Aplicacao {

	private static Scanner scanner;

	public static void aplicacao() {

		scanner = new Scanner(System.in);
		System.out.println("Entre um tipo de permanência\n" + "1 - Array\n2 - Vector\n3 - ArrayList");
		int appPer = scanner.nextInt();
		AgendaTelefonica agenda = new AgendaTelefonica(appPer);
		int sair = 0;
		int opcao = 0;
		while (sair == 0) {
			switch (opcao) {
			case 0:
				agenda.imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			case 1:
				agenda.imprimirPessoas();
				opcao = 0;
				break;
			case 2:
				agenda.cadastrarPessoa();
				opcao = 0;
				break;
			case 3:
				sair = 1;
				System.out.println("\nAté mais!");
				break;
			default:
				agenda.imprimirOpcoes();
				opcao = scanner.nextInt();
				break;
			}
		}
	}

}

class Pessoa {

	private String nome;
	private String telefone;
	private String email;

	public Pessoa(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class AgendaTelefonica {

	private static final int J = 5;
	private Pessoa[] pessoas;
	private Vector<Pessoa> pessoasVec;
	private ArrayList<Pessoa> pessoasArrList;
	private Scanner scanner;
	private int appPer = 1;

	public AgendaTelefonica(int appPer) {
		this.appPer = appPer;
		scanner = new Scanner(System.in);
		if (appPer == 1) {
			pessoas = new Pessoa[5];
		} else if (appPer == 2) {
			pessoasVec = new Vector<Pessoa>(5);
		} else if (appPer == 3) {
			pessoasArrList = new ArrayList<Pessoa>();
		} else {
			System.out.println("oh man, algo de errado aconteceu - AgendaTelefonica()");
		}
	}

	public void cadastrarPessoa() {
		for (int i = 0; i < J; i++) {
			if (pessoas[i] == null) {
				System.out.println("\n Insira um nome para a pessoa");
				String nome = scanner.next();
				System.out.println("\nInsira um telefone para a pessoa");
				String telefone = scanner.next();
				System.out.println("\nInsira um email para a pessoa");
				String email = scanner.next();
				Pessoa nova = new Pessoa(nome, telefone, email);
				permanencia(appPer, nova, i);
				System.out.println("\nNovo contato adicionado\n");
				break;
			}
		}
	}

	public void permanencia(int appPer, Pessoa nova, int i) {
		if (appPer == 1) {
			pessoas[i] = nova;
		} else if (appPer == 2) {
			pessoasVec.addElement(nova);
		} else if (appPer == 3) {
			pessoasArrList.add(nova);
		} else {
			System.out.println("oh man, algo de errado aconteceu - permanencia()");
		}
	}

	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma das opções: \n");
		System.out.println("1 - Listar contatos \n");
		System.out.println("2 - Incluir contatos \n");
		System.out.println("3 - Sair \n");
	}

	public void imprimirPessoas() {
		for (Pessoa pessoa : pessoas) {
			if (pessoa != null) {
				System.out.println("\nNome: " + pessoa.getNome() + "\nTelefone: " + pessoa.getTelefone() + "\nEmail: "
						+ pessoa.getEmail());
			}
		}
	}

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}
}
