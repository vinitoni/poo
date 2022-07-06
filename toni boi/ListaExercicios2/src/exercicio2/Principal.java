package exercicio2;

public class Principal {
	public static void main(String[] args) {
		Filme filme1 = new Filme();
		Filme filme2 = new Filme("Fast and Furious", 16, 180);
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("Sintonia", 16, 2, 12);
		Filme filmes[] = new Filme[2];
		filmes[0] = filme1;
		filmes[1] = filme2;
		Serie series[] = new Serie[2];
		series[0] = serie1;
		series[1] = serie2;
		filmes[0].setNome("Madagascar");
		filmes[0].setClassificacao(10);
		filmes[0].setDuracao_min(160);
		series[0].setNome("La Casa de Papel");
		series[0].setClassificacao(16);
		series[0].setQuantTemporadas(3);
		series[0].setQuantEpisodios(40);
		Comedia comedia1 = new Comedia();
		Comedia comedia2 = new Comedia(filmes, 2, series, 2);
		Romance romance1 = new Romance();
		Romance romance2 = new Romance(filmes, 2, series, 2);
		Acao acao1 = new Acao();
		Acao acao2 = new Acao(filmes, 2, series, 2);
	}
}
