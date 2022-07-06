package exercicio1;

public class Mod implements IOperacaoInteira{

	public int executar(int valora, int valorb) {
		return valora - valora/valorb * valorb;
	}
}
