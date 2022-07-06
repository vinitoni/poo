package exercicio1;

public class Multiplicacao extends Soma{
	
	public int executar(int valora, int valorb) {
		int multiplicacao = 0;
		while(valorb > 0) {
			multiplicacao += super.executar(valora, valora);
			valorb--;
		}
		return multiplicacao;
	}
}
