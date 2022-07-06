package exercicio1;

public class Serie {
	private String nome;
	private int classificacao;
	private int quantTemporadas;
	private int quantEpisodios;
	
	public Serie() {
		
	}
	
	public Serie(String nome, int classificacao, int quantTemporadas, int quantEpisodios) {
		this.nome = nome;
		this.classificacao = classificacao;
		this.quantTemporadas = quantTemporadas;
		this.quantEpisodios = quantEpisodios;
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
	public int getQuantTemporadas() {
		return quantTemporadas;
	}
	public void setQuantTemporadas(int quantTemporadas) {
		this.quantTemporadas = quantTemporadas;
	}
	public int getQuantEpisodios() {
		return quantEpisodios;
	}
	public void setQuantEpisodios(int quantEpisodios) {
		this.quantEpisodios = quantEpisodios;
	}
	
	public String toString() {
		return "Nome: " + nome + "\nClassificação: " + classificacao + "\nTemporadas: " + quantTemporadas + "Total de eposódios: " + quantEpisodios;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Serie) {
			Serie c = (Serie) o;
			if(c.getNome().equals(this.getNome())) {
				return true;
			}
		}
		return false;
	}
}
