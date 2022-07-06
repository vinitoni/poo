import java.util.Scanner;

public class Exercicio7 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o dia do nascimento [1-31]:");
		int dia = Integer.parseInt(s.nextLine());
		System.out.println("Digite o mes do nascimento [1-12]:");
		int mes = Integer.parseInt(s.nextLine());
		System.out.println("Digite o ano do nascimento:");
		int ano = Integer.parseInt(s.nextLine());
				
		int idade = 0;
		
		if(mes > 10)
			idade = (2021 - ano - 1) * 365 + (12 - mes) * 31 - dia + 9 * 31 + 10;
		
		if(mes == 10)
			if(dia > 10)
				idade = (2021 - ano - 1) * 365 + (12 - mes) * 31 - dia + 9 * 31 + 10;
			else 
				idade = (2021 - ano) * 365 + (10 - dia) * 31;
		
		if(mes < 10)
			idade = (2021 - ano) * 365 + (10 - mes) * 31 - dia + 10;
		
		System.out.print("Idade em dias aproximadamente: " + idade);
	}
}
