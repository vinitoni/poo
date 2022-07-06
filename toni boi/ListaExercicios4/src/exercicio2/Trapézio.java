package exercicio2;

public class Trap�zio extends FormaGeometrica{
	private int altura;
	
	public Trap�zio(int menor, int maior, int altura) {
		this.setBaseMenor(menor);
		this.setBaseMaior(maior);
		this.setAltura(altura);
	}
	
	public void setBaseMenor(int valor) {
		medida1 = valor;
	}
	
	public void setBaseMaior(int valor) {
		medida2 = valor;
	}
	
	public void setAltura(int valor) {
		altura = valor;
	}
	
	public int calcularArea() {
		return (medida2 - medida1) * altura / 2;
	}
	
	public int calcularPerimetro() {
		return (int) Math.sqrt(Math.pow((medida2 - medida1) / 2, 2)) * 4;
	}
	
	public String toString() {
		return "Base menor: " + medida1 + "\nBase maior: " + medida2 + "\nAltura: " + altura + "\n�rea: " + this.calcularArea() + "\nPer�metro: " + this.calcularPerimetro();
	}
	
}
