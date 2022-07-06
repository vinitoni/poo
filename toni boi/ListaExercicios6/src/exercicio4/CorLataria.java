package exercicio4;

public enum CorLataria {
	BRANCO(new Branco()),PRETO(new Preto()),PRATA(new Prata()),
	VERMELHO(new Vermelho()),AZUL(new Azul());

	private Cor tipo;
	
	private CorLataria(Cor cor) {
		tipo = cor;
	}
	
	public Cor getCor() {
		return tipo;
	}
}
