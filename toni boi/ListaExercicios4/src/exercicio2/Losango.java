package exercicio2;

public class Losango extends FormaGeometrica{
	
	public Losango(int D, int d) {
		this.setD(D);
		this.setd(d);
	}
	
	public void setD(int valor) {
		medida1 = valor;
	}
	
	public void setd(int valor) {
		medida2 = valor;
	}
	
	public int calcularArea() {
		return medida1 * medida2 / 2;
	}
	
	public int calcularPerimetro() {
		return (int) Math.sqrt((medida1 * medida1 / 4) + (medida2 * medida2 / 4)) * 4;
	}
	
	public String toString() {
		return "D: " + medida1 + "\nd: " + medida2 + "\nÁrea: " + this.calcularArea() + "\nPerímetro: " + this.calcularPerimetro();
	}
}