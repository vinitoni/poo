package exercicio2;

public class Principal {
	public static void main(String[] args) {
		Trapézio trapezio1 = new Trapézio(2,4,6);
		Trapézio trapezio2 = new Trapézio(1,2,3);
		Losango losango1 = new Losango(8,5);
		Losango losango2 = new Losango(23,15);
		Circulo circulo1 = new Circulo(2);
		Circulo circulo2 = new Circulo(10);
		
		System.out.println(trapezio1);
		System.out.println(trapezio2);
		System.out.println(losango1);
		System.out.println(losango2);
		System.out.println(circulo1);
		System.out.println(circulo2);
	}
}
