package exercicio4;
import java.util.List;

public class Equipe<T> {
	private String nome;
	private List<T> lista;
	
	
	public void setLista(List<T> lista) {
		this.lista = lista;
	}

	public String toString() {
		return "Nome da equipe: " + nome + "\nAlunos:\n" + lista.toString();
	}
}
