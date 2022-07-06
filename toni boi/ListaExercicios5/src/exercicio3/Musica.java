package exercicio3;

public class Musica extends Arquivo{
	private int duracao;
	
	public Musica(String nome, int duracao) throws NomeInvalidoException{
		super(nome);
		this.duracao = duracao;
		this.setExtensao(".mp3");
	}
	
	public String toString() {
		return this.getNome() + this.getExtensao() + "\nDuracao: " + duracao;
	}
}
