package exercicio3;

public class Grafo extends Digrafo{
	
	public void adicionarAresta(int origem, int destino) {
		this.getMatrizAdjacencia1().get(origem).set(destino, 1);
		this.getMatrizAdjacencia1().get(destino).set(origem, 1);
	}
}
