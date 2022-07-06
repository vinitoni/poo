package exercicio4;
import java.util.Scanner;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Turma turma = new Turma();
		int op;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("\nOpções:");
			System.out.println(" 0 - Cadastrar aluno");
			System.out.println("-1 - Sair");
			op = Integer.parseInt(s.nextLine());
			
			switch(op) {
			case 0:
				Aluno aluno = new Aluno();
				System.out.println("Digite o nome:");
				aluno.setNome(s.nextLine());
				System.out.println("Digite a idade:");
				aluno.setIdade(Integer.parseInt(s.nextLine()));
				double notas[] = new double[5];
				for(int i=0;i<5;i++) {
					System.out.println("Digite a nota " + i + ":");
					notas[i] = Double.parseDouble(s.nextLine());
				}
				aluno.setNotas(notas);
				turma.adicionarAlunos(aluno);
				break;
			case -1:
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}while(op!=-1);
		
		List<Equipe<Aluno>> lista = turma.separarEmEquipes();
		
		for(Equipe<Aluno> i: lista)
			System.out.println(i.toString());
	}
}
