package exercicio4;

public class Main {

	public static void main(String[] args) {
		Veiculo vei1 = new Veiculo();
		vei1.setValorInicial(40000);
		vei1.setCor(CorLataria.PRATA);
		vei1.setMotor(PotenciaMotor.MOTOR12);
		vei1.setVent(TipoVentilacao.AR_CONDICIONADO);
		
		Veiculo vei2 = new Veiculo();
		vei2.setValorInicial(40000);
		vei2.setCor(CorLataria.BRANCO);
		vei2.setMotor(PotenciaMotor.MOTOR10);
		vei2.setVent(TipoVentilacao.NORMAL);
		
		Veiculo vei3 = new Veiculo();
		vei3.setValorInicial(40000);
		vei3.setCor(CorLataria.VERMELHO);
		vei3.setMotor(PotenciaMotor.MOTOR20);
		vei3.setVent(TipoVentilacao.NORMAL);
		
		System.out.println(vei1.calculaTotal());
		System.out.println(vei2.calculaTotal());
		System.out.println(vei3.calculaTotal());
	}

}
