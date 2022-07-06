import java.util.Scanner;

public class Exercicio6 {

	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		str1 = str1.toLowerCase();
		String str2 = s.nextLine();
		str2 = str2.toLowerCase();
		String aux = "";
		
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					boolean cons = false;
					for(int c=0;c<aux.length();c++) {
						if(str1.charAt(i) == aux.charAt(c)) {
							cons = true;
							break;
						}
					}
					if(cons)
						break;
					else
						aux += str1.charAt(i);
				}
			}
		}
		
		char strchar[] = aux.toCharArray();
		for(int i=0;i<strchar.length;i++) {
			for(int j=0;j<strchar.length;j++) {
				if(strchar[j] > strchar[i]) {
					char aux2 = strchar[j];
					strchar[j] = strchar[i];
					strchar[i] = aux2;
				}
			}
		}
		
		
		System.out.print("Letras presentes em ambas as String’s ordenadas em ordem alfabética: " + new String(strchar));
	}
}
