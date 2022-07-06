package exercicio4;

public enum TipoVentilacao {
	
	AR_CONDICIONADO(new ArCondicionado()), NORMAL(new Normal());

	private Ventilacao tipo;
	
	private TipoVentilacao(Ventilacao tipo) {
		this.tipo = tipo;
	}
	
	public Ventilacao getTipo() {
		return tipo;
	}
}
