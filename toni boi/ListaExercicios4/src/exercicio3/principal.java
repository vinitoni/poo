package exercicio3;

public class principal {
	public static void main(String[] args) {
		Digrafo digrafo = new Digrafo();
		Grafo grafo = new Grafo();
		
		for(int i=0;i<5;i++) {
			digrafo.adicionarVertice();
			grafo.adicionarVertice();
		}
		
		grafo.adicionarAresta(0, 2);
		grafo.adicionarAresta(0, 1);
		grafo.adicionarAresta(2, 3);
		grafo.adicionarAresta(2, 1);
		grafo.adicionarAresta(1, 1);
		grafo.adicionarAresta(1, 3);
		grafo.adicionarAresta(1, 4);
		grafo.adicionarAresta(3, 4);
		
		digrafo.aidiconarAresta(0, 2);
		digrafo.aidiconarAresta(0, 1);
		digrafo.aidiconarAresta(1, 1);
		digrafo.aidiconarAresta(1, 3);
		digrafo.aidiconarAresta(2, 0);
		digrafo.aidiconarAresta(2, 1);
		digrafo.aidiconarAresta(2, 3);
		digrafo.aidiconarAresta(3, 4);
		digrafo.aidiconarAresta(4, 1);
		
		System.out.println(digrafo);
		System.out.println();
		System.out.println(grafo);
	}
}
