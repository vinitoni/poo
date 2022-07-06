package exercicio2;
import java.util.List;
import java.util.LinkedList;

public class Matriz<T> {
	int i,j;
	T matriz[][];
	
	public Matriz(int n, int m){
		matriz = (T[][]) new Object[n][m];
		i = n;
		j = m;
	}
	
	public boolean set(T objeto, int i, int j) {
		if( i >= this.i || j >= this.j)
			return false;
		matriz[i][j] = objeto;
		return true;
	}
	
	public T get(int i, int j) {
		if( i > this.i || j > this.j)
			return null;
		return matriz[i][j];
	}
	
	public List<T> getLinha(int linha){
		List<T> lista = new LinkedList<T>();
		if(linha > this.i)
			return null;
		for(int m=0;m<j;m++)
			lista.add(matriz[linha][m]);
		return lista;
	}
	
	public List<T> getColuna(int coluna){
		List<T> lista = new LinkedList<T>();
		if(coluna > this.j)
			return null;
		for(int m=0;m<i;m++)
			lista.add(matriz[m][coluna]);
		return lista;
	}
	
	public List<T> getElementosQuadrante(Quadrante quadrante){
		List<T> lista = new LinkedList<T>();
		int comecoL = -1,comecoC = -1,finalL = -1,finalC = -1;
		if(quadrante.getValor() < 1 || quadrante.getValor() > 4)
			return null;
		if(quadrante.getValor() == 1) {
			comecoL = 0;
			comecoC = 0;
			if(i % 2 == 0)
				finalL = i / 2 - 1;
			else
				finalL = i / 2;
			if(j % 2 == 0)
				finalC = j / 2 - 1;
			else
				finalC = j / 2;
		}
		if(quadrante.getValor() == 2) {
			finalC = j - 1;
			comecoL = 0;
			if(i % 2 == 0)
				finalL = i / 2 - 1;
			else
				finalL = i / 2;
			if(j % 2 == 0)
				comecoC = j / 2;
			else
				comecoC = j / 2 + 1;
		}
		if(quadrante.getValor() == 3) {
			finalL = i - 1;
			comecoC = 0;
			if(j % 2 == 0)
				finalC = j / 2 - 1;
			else
				finalC = j / 2;
			if(i % 2 == 0)
				comecoL = i / 2;
			else
				comecoL = i / 2 + 1;
		}
		if(quadrante.getValor() == 4) {
			finalL = i - 1;
			finalC = j - 1;
			if(i % 2 == 0)
				comecoL = i / 2;
			else
				comecoL = i / 2 + 1;
			if(j % 2 == 0)
				comecoC = i / 2;
			else
				comecoC = i / 2 + 1;
		}
		for(int i=comecoL;i<=finalL;i++)
			for(int j=comecoC;j<=finalC;j++)
				lista.add(matriz[i][j]);
		return lista;
	}
	
}
