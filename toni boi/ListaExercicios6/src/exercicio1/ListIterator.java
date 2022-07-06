package exercicio1;

import java.util.List;

public class ListIterator<T> implements Iterator<T>{
	private List<T> lista;
	private int par = 0;
	private int impar = 1;
	
	public ListIterator(List<T> lista) {
		this.lista = lista;
	}
	
	public boolean hasNext() {
		if(par >= lista.size() && impar >= lista.size()) {
			reset();
			return false;
		}
		return true;
	}
	
	public T next(){
		int aux;
		if(par < lista.size()) {
			aux = par;
			par += 2;
		}else{
			aux = impar;
			impar += 2;
		}
	
		return lista.get(aux);
	}
	
	public void reset() {
		par = 0;
		impar = 1;
	}
}
