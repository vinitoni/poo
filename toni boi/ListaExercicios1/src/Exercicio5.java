import java.util.Scanner;

public class Exercicio5 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String aux = "";
		int vog = 0,cons = 0;
		
		for(int i=str.length()-1;i>=0;i--) {
			aux += str.charAt(i);
			if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U') {
				vog++;
			} else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				cons++;
			}
		}
		
		System.out.println("Palavra original: " + str);
		System.out.println("Palavra invertida: " + aux);
		if(str == aux)
			System.out.println("Essa palavra é um palíndromo!");
		else
			System.out.println("Essa palavra não é um palíndromo.");
		System.out.println("Número de vogais em " + str + ": " + vog);
		System.out.println("Número de consoantes em " + str + ": " + cons);
	}
}
