package exercicio3;

import java.util.LinkedList;
import java.util.List;

public class Servidor implements Sujeito{
	private String ip;
	private String ultimaMensagem;
	private List<Observador> lista = new LinkedList<Observador>();
	
	public void adicionar(Observador observador) {
		lista.add(observador);
	}
	public void remover(Observador obervador) {
		lista.remove(obervador);
	}
	public void notificar() {
		for(Observador i:lista) {
			Cliente cli = (Cliente) i;
			cli.atualizar(toString() + ": " + ultimaMensagem);
		}
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	public void enviarMensagem(String mensagem) {
		ultimaMensagem = mensagem;
		notificar();
	}
	
	public String toString() {
		return ip;
	}
}
