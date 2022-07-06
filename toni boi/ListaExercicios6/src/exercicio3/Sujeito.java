package exercicio3;

public interface Sujeito {
	public void adicionar(Observador observador);
	public void remover(Observador obervador);
	public void notificar();
}
