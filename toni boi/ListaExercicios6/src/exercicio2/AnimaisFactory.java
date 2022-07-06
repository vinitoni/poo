package exercicio2;

public class AnimaisFactory {
	private static AnimaisFactory instance = null;
	
	private AnimaisFactory() {
		
	}
	
	public static AnimaisFactory getInstance() {
		if(instance == null)
			instance = new AnimaisFactory();
		
		return instance;
	}
	
	public Animal createAnimal(Animais animal) {
		switch(animal) {
		case CAO:
			return new Cão();
		case GATO:
			return new Gato();
		case SAPO:
			return new Sapo();
		case RATO:
			return new Rato();
		case COBRA:
			return new Cobra();
		default:
			return null;
		}
	}
}
