package exercicio1;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		List<Pessoa> lista1 = new LinkedList<Pessoa>();
		List<Pessoa> lista2 = new LinkedList<Pessoa>();
		List<Pessoa> lista3 = new LinkedList<Pessoa>();
		List<Pessoa> lista4 = new LinkedList<Pessoa>();
		List<Pessoa> lista5 = new LinkedList<Pessoa>();
		
		Scanner s = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("\nOpções:");
			System.out.println(" 0 - Cadastrar pessoa");
			System.out.println("-1 - Sair");
			op = Integer.parseInt(s.nextLine());
			switch(op) {
			case 0:
				Pessoa pessoa = new Pessoa();
				System.out.println("Digite o nome:");
				pessoa.setNome(s.nextLine());
				System.out.println("Digite a idade:");
				pessoa.setIdade(Integer.parseInt(s.nextLine()));
				System.out.println("Digite o cpf:");
				pessoa.setCpf(Integer.parseInt(s.nextLine()));
				System.out.println("Digite a cidade:");
				pessoa.setCidade(s.nextLine());
				if(pessoa.getIdade() >= 1 && pessoa.getIdade() <= 12)
					lista1.add(pessoa);
				if(pessoa.getIdade() >= 13 && pessoa.getIdade() <= 18)
					lista2.add(pessoa);
				if(pessoa.getIdade() >= 19 && pessoa.getIdade() <= 25)
					lista3.add(pessoa);
				if(pessoa.getIdade() >= 26 && pessoa.getIdade() <= 59)
					lista4.add(pessoa);
				if(pessoa.getIdade() >= 60)
					lista5.add(pessoa);
				System.out.println("\n1 até 12: crianças;");
				Collections.sort(lista1);
				for(Pessoa i: lista1)
					System.out.println(i);
				System.out.println("13 até 18: adolescentes;");
				Collections.sort(lista2);
				for(Pessoa i: lista2)
					System.out.println(i);
				System.out.println("19 até 25: jovens;");
				Collections.sort(lista3);
				for(Pessoa i: lista3)
					System.out.println(i);
				System.out.println("26 até 59: adultos;");
				Collections.sort(lista4);
				for(Pessoa i: lista4)
					System.out.println(i);
				System.out.println("60 ou mais: idosos;");
				Collections.sort(lista5);
				for(Pessoa i: lista5)
					System.out.println(i);
				break;
			case -1:
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}while(op!=-1);
	}
	
}
