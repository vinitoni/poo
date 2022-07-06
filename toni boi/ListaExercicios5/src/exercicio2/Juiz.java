package exercicio2;

public class Juiz {
	private String nome;
	private Pilha<Processo> processos;
	
	public Juiz(int limite) {
		processos = new Pilha<Processo>(limite);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void cadastrarProcesso(Processo processo) throws PilhaCheiaException{
		processos.inserir(processo);
	}
}
