package lista_1.dependencias.exercicio_8;

public class Professor extends Pessoa{
	
	public int numeroMatricula;
	public String[] turmas;
	
	public Professor(String nome, int numeroMatricula) {
		super(nome);
		this.numeroMatricula = numeroMatricula;
	}
	
	public void setDiciplinas(String[] turmas) {
		this.turmas = turmas;
	}
}
