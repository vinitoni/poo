package exercicio4;

public class Aluno {
	private String nome;
	private int idade;
	private double notas[] = new double[5];
	
	public double calcularMedia() {
		double soma = 0;
		for(int i=0;i<5;i++) {
			soma += notas[i];
		}
		return soma/(5*1.0);
	}
	
	public String toString(){
		return " - Nome: " + nome + " Idade: " + idade + " Média: " + calcularMedia();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
}
