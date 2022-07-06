package exercicio1;

public class Principal {
	public static void main(String [] args) {
		Gato gato1 = new Gato("Abelhinha");
		Gato gato2 = new Gato("Chewie");
		Cachorro cachorro1 = new Cachorro("Chico");
		Cachorro cachorro2 = new Cachorro("Chila");
		Passaro passaro1 = new Passaro("Abel");
		Passaro passaro2 = new Passaro("Ale");
		System.out.println(gato1.emitirSom());
		System.out.println(gato2.emitirSom());
		System.out.println(cachorro1.emitirSom());
		System.out.println(cachorro2.emitirSom());
		System.out.println(passaro1.emitirSom());
		System.out.println(passaro2.emitirSom());
	}
}
