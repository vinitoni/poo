package exercicio3;

public class Imovel {
	private float largura;
	private float comprimento;
	private float valor;
	
	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float calculaArea() {
		return largura * comprimento;
	}
	
	public String toString() {
		return "\nLargura: " + largura + "\nComprimento: " + comprimento + "\n¡rea: " + this.calculaArea() + "\nValor: " + valor;
	}
}
