package exercicio2;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		SistemaProcessos sistema = new SistemaProcessos();
		
		Juiz juiz1 = new Juiz(5);
		juiz1.setNome("Jose");
		Juiz juiz2 = new Juiz(5);
		juiz2.setNome("Luis");
		Juiz juiz3 = new Juiz(5);
		juiz3.setNome("Sandro");
		
		sistema.cadastrarJuiz(juiz1);
		sistema.cadastrarJuiz(juiz2);
		sistema.cadastrarJuiz(juiz3);
		
		List<Processo> processos = new LinkedList<Processo>();
		
		for(int i=0;i<18;i++) {
			Processo processo;
			processos.add(processo = new Processo());
		}
		
		for(int i=0;i<18;i++) {
			sistema.cadastrarProcesso(processos.get(i));
		}
		
		try {
			sistema.distribuirProcessos();
		}catch(ProcessoSemJuizException ps) {
			System.out.println("Todos os juizes estao com a pilha de processos cheia.");
		}
	}
}
