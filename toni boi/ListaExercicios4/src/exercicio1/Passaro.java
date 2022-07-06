package exercicio1;

public class Passaro extends Animal{
	public Passaro(String nome) {
		super(nome);
	}
	public String emitirSom() {
		return this.getNome() + ": PiuPiu";
	}
}
