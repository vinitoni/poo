package exercicio3;

public class Documento extends Arquivo{
	private String texto;
	
	public Documento(String nome, String texto) throws NomeInvalidoException{
		super(nome);
		this.texto = texto;
		this.setExtensao(".txt");
	}
	
	public String toString(){
		return this.getNome() + this.getExtensao();
	}
	
}