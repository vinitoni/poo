package exercicio2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SistemaProcessos {
	private List<Processo> processos = new LinkedList<Processo>();
	private List<Juiz> juizes = new LinkedList<Juiz>();
	
	public void cadastrarProcesso(Processo processo) {
		processos.add(processo);
	}
	
	public void cadastrarJuiz(Juiz juiz) {
		juizes.add(juiz);
	}
	
	public void distribuirProcessos() throws ProcessoSemJuizException{
		List<Integer> lista = new LinkedList<Integer>();
		for(int i=0;i<juizes.size();i++)
			lista.add(i);
		
		Random gerador = new Random();

		for(Processo i:processos) {
			boolean cont = true;
			while(cont) {
				if(lista.size()==0) 
					throw new ProcessoSemJuizException();
				int juiz = lista.get(gerador.nextInt(lista.size()));
				try {
					juizes.get(juiz).cadastrarProcesso(i);
					cont = false;
				}catch(PilhaCheiaException pc){
					lista.remove((Integer) juiz);
				}
			}
		}
	}
}
