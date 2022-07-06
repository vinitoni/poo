package exercicio3;

public class Video extends Arquivo{
	Qualidade qualidade;
	
	public Video(String nome, Qualidade qualidade) throws NomeInvalidoException{
		super(nome);
		this.qualidade = qualidade;
		this.setExtensao(".mp4");
	}
	
	public String toString(){
		return this.getNome() + this.getExtensao() + "\nQualidade: " + qualidade;
	}
}
