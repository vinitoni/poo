package exercicio4;

public class Veiculo {
	private double valorInicial;
	private CorLataria cor;
	private PotenciaMotor motor;
	private TipoVentilacao vent;
	
	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public void setCor(CorLataria cor) {
		this.cor = cor;
	}

	public void setMotor(PotenciaMotor motor) {
		this.motor = motor;
	}

	public void setVent(TipoVentilacao vent) {
		this.vent = vent;
	}

	public double calculaValorCor() {
		return cor.getCor().calculaValorCor();
	}
	
	public double calculaFatorMotor() {
		return motor.getMotor().calculaFatorMotor() * valorInicial / 100;
	}
	
	public double calculaValorVentilacao() {
		return vent.getTipo().calculaValorVentilacao();
	}
	
	public double calculaTotal() {
		return valorInicial + calculaValorCor() + calculaFatorMotor() + calculaValorVentilacao(); 
	}
}
