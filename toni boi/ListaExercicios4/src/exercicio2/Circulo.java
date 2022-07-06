package exercicio2;

public class Circulo extends FormaGeometrica{
	
	public Circulo(int valor) {
		this.setRaio(valor);
		medida2 = medida1 * 2;
	}
	
	public void setRaio(int valor) {
		medida1 = valor;
	}
	
	public int calcularArea() {
		return (int) Math.PI * medida1 * medida1;
	}
	
	public int calcularPerimetro() {
		return (int) Math.PI * medida2;
	}
	
	public String toString() {
		return "Raio: " + medida1 + "\nDiâmetro: " + medida2 + "\nÁrea: " + this.calcularArea() + "\nPerímetro " + this.calcularPerimetro();
	}
}
