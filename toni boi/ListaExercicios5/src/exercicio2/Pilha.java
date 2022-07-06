package exercicio2;

import java.util.LinkedList;
import java.util.List;

public class Pilha<T> {
	private int limite;
	private List<T> elementos = new LinkedList<T>();
	
	public Pilha(int limite) {
		this.limite = limite;
	}
	
	public void inserir(T objeto) throws PilhaCheiaException{
		if(elementos.size() < limite)
			elementos.add(objeto);
		else
			throw new PilhaCheiaException();
	}
	
	public T remover() throws PilhaVaziaException{
		if(elementos.size()>0) {
			T elemento = elementos.get(elementos.size()-1);
			elementos.remove(elementos.size()-1);
			return elemento;
		}else {
			throw new PilhaVaziaException();
		}
	}
	
	public int getSize() {
		return elementos.size();
	}
}
