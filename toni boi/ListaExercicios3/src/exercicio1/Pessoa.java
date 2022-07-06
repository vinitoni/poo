package exercicio1;

public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private int idade;
	private int cpf;
	private String cidade;
	
	public int compareTo(Pessoa p) {
		return this.getNome().compareTo(p.getNome());
	}

	public String toString() {
		return " - " + nome + ", " + idade + ", " + cpf + ", " + cidade + ";";
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
