package exercicio3;

import java.util.List;
import java.util.LinkedList;

public class Digrafo {
	
	private List<List<Integer>> matrizAdjacencia1 = new LinkedList<List<Integer>>();
	
	public void adicionarVertice() {
		List<Integer> vertice = new LinkedList<Integer>();
		matrizAdjacencia1.add(vertice);
		for(List<Integer> i: matrizAdjacencia1)
			for(int j=0;i.size()!=matrizAdjacencia1.size();j++)
				i.add(0);
				
	}
	
	public void aidiconarAresta(int origem, int destino) {
		matrizAdjacencia1.get(origem).set(destino, 1);
	}
	
	public List<List<Integer>> getMatrizAdjacencia1() {
		return matrizAdjacencia1;
	}

	public String toString() {
		String retorno;
		
		retorno = "   ";
		
		for(int i=0;i<matrizAdjacencia1.size();i++)
			retorno += i + " "; 
		
		retorno += "\n   ";
		
		for(int i=0;i<matrizAdjacencia1.size();i++)
			retorno += "--";
		
		retorno += "\n";
		
		for(int i=0;i<matrizAdjacencia1.size();i++) {
			retorno += i + "| ";
			for(int j=0;j<matrizAdjacencia1.get(i).size();j++) {
				retorno += matrizAdjacencia1.get(i).get(j) + " ";
			}
			retorno += "\n";
		}
		
		return retorno;
	}
}
