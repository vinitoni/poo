import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Operações possíveis:\n1 - Potênciação\n2 - Resto de divisão\n");
		int escolha = Integer.parseInt(s.nextLine());
		
		if(escolha == 1) {
			System.out.print("Informe a base:\n");
			int base = Integer.parseInt(s.nextLine());
			System.out.print("Informe a potência:\n");
			int pot = Integer.parseInt(s.nextLine());
			System.out.println(base + " elevado a " + pot + " = " + exp(base,pot));
		}else if(escolha == 2) {
				System.out.print("Informe o dividendo:\n");
					int divd = Integer.parseInt(s.nextLine());
				System.out.print("Informe o divisor:\n");
				int divs = Integer.parseInt(s.nextLine());
				System.out.println("O resto da divisão de " + divd + " por " + divs + " = " + resto(divd,divs));
		} else 
			System.out.println("Escolha inválida.");
			
	}

	public static float exp (float x, int y) {
		
		if(y == 0)
			return 1;
		
		float pot = 1;
		
		if(y < 0) {
			y *= -1;
			for(int i=0;i<y;i++) {
				pot *= x;
			}
			return 1/pot;
		}
		
		for(int i=0;i<y;i++) {
			pot *= x;
		}
		
		return pot;
	}
	
	public static int resto (int x, int y) {
		
		if( x < y)
			return x;
		
		int resto = x - (x / y * y);
		
		return resto;
	}
}
