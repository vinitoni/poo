package exercicio3;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Matriz<Integer> matriz = new Matriz<Integer>(5,5);
		Scanner s = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("\nOpções:");
			System.out.println(" 0 - Ler matriz 5x5");
			System.out.println("-1 - Sair");
			op = Integer.parseInt(s.nextLine());
			switch(op) {
			case 0:
				for(int i=0;i<5;i++)
					for(int j=0;j<5;j++) {
						System.out.print("[" + i + "]" + "[" + j + "]: ");
						matriz.set(Integer.parseInt(s.nextLine()), i, j);
					}
				List<Integer> lista1 = new LinkedList<Integer>();
				List<Integer> lista2 = new LinkedList<Integer>();
				List<Integer> lista3 = new LinkedList<Integer>();
				List<Integer> lista4 = new LinkedList<Integer>();
				List<Integer> menor = new LinkedList<Integer>();
				lista1 = matriz.getElementosQuadrante(Quadrante.PRIMEIRO);
				lista2 = matriz.getElementosQuadrante(Quadrante.SEGUNDO);
				lista3 = matriz.getElementosQuadrante(Quadrante.TERCEIRO);
				lista4 = matriz.getElementosQuadrante(Quadrante.QUARTO);
				Collections.sort(lista1);
				Collections.sort(lista2);
				Collections.sort(lista3);
				Collections.sort(lista4);
				menor.add(lista1.get(0));
				menor.add(lista2.get(0));
				menor.add(lista3.get(0));
				menor.add(lista4.get(0));
				Collections.sort(menor);
				System.out.println("O menor elemento da matriz é: " + menor.get(0));
				break;
			case -1:
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}while(op!=-1);

	}
}
