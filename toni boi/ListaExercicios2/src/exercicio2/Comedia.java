package exercicio2;

public class Comedia {
	private Filme filmes[] = new Filme[20];
	private Serie series[] = new Serie[20];
	private String nomeGenero = "Com�dia";
	private int quantFilmes = 0;
	private int quantSeries = 0;
	
	public Comedia() {
		
	}
	
	public Comedia(Filme filmes[], int quantFilmes, Serie series[], int quantSeries) {
		for(int i = 0;i<quantFilmes;i++) {
			this.filmes[i] = filmes[i];
		}
		this.quantFilmes = quantFilmes;
		for(int i = 0;i<quantSeries;i++) {
			this.series[i] = series[i];
		}	
		this.quantSeries = quantSeries;
	}
	
	public Filme[] getFilmes() {
		return filmes;
	}
	public void setFilmes(Filme filme) {
		this.filmes[quantFilmes] = filme;
		quantFilmes++;
	}
	public Serie[] getSeries() {
		return series;
	}
	public void setSeries(Serie serie) {
		this.series[quantSeries] = serie;
		quantSeries++;
	}
	public String getNomeGenero() {
		return nomeGenero;
	}
	public int getQuantFilmes() {
		return quantFilmes;
	}
	public int getQuantSeries() {
		return quantSeries;
	}
	
	public String toString() {
		String concat = "";
		for(int i=0;i<quantFilmes;i++) {
			concat += "\nFilme " + (i+1) + ":\nNome: " + filmes[i].getNome() + "\nDura��o: " + filmes[i].getDuracao_min() + "\nClassifica��o: " + filmes[i].getClassificacao();
		}
		for(int i=0;i<quantFilmes;i++) {
			concat += "\nS�rie " + (i+1) + ":\nNome: " + series[i].getNome() + "\nClassifica��o: " + series[i].getClassificacao() + "\nTemporadas: " + series[i].getQuantTemporadas() + "Total de epos�dios: " + series[i].getQuantEpisodios();
		}
		return concat;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Comedia) {
			Comedia c = (Comedia) o;
			if(c.getNomeGenero().equals(this.getNomeGenero())) {
				return true;
			}
		}
		return false;
	}
}
