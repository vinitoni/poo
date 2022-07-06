package exercicio2;

public enum Quadrante {
	PRIMEIRO(1),SEGUNDO(2),TERCEIRO(3),QUARTO(4);
	
	private int valor;
	
	private Quadrante(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}
