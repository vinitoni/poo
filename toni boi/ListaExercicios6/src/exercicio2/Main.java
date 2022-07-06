package exercicio2;

public class Main {

	public static void main(String[] args) {
		AnimaisFactory factory = AnimaisFactory.getInstance();
		
		Animal a1 = factory.createAnimal(Animais.CAO);
		Animal a2 = factory.createAnimal(Animais.GATO);
		Animal a3 = factory.createAnimal(Animais.SAPO);
		Animal a4 = factory.createAnimal(Animais.RATO);
		Animal a5 = factory.createAnimal(Animais.COBRA);

	}

}
