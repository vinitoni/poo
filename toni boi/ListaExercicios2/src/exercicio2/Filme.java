package exercicio2;

public class Filme {
	private String nome;
	private int classificacao;
	private int duracaoMin;
	
	public Filme() {
		
	}
	
	public Filme(String nome, int classificacao, int duracaoMin) {
		this.nome = nome;
		this.classificacao = classificacao;
		this.duracaoMin = duracaoMin;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	public int getDuracao_min() {
		return duracaoMin;
	}
	public void setDuracao_min(int duracao_min) {
		this.duracaoMin = duracao_min;
	}
	
	public String toString() {
		return "Nome: " + nome + "\nDuração: " + duracaoMin + "\nClassificação: " + classificacao;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Filme) {
			Filme c = (Filme) o;
			if(c.getNome().equals(this.getNome())) {
				return true;
			}
		}
		return false;
	}
}
