package exercicio1;

public class Cachorro extends Animal{
	public Cachorro(String nome) {
		super(nome);
	}
	public String emitirSom() {
		return this.getNome() + ": AuAu";
	}
}
