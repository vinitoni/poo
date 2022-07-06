package exercicio1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		List<IOperacaoInteira> lista = new LinkedList<IOperacaoInteira>();
		
		Soma soma = new Soma();
		Multiplicacao multip = new Multiplicacao();
		MDC mdc = new MDC();
		Mod mod = new Mod();

		lista.add(soma);
		lista.add(multip);
		lista.add(mdc);
		lista.add(mod);
		
		Random gerador = new Random();
		
		for(IOperacaoInteira i:lista)
			System.out.println(i.executar(gerador.nextInt(50) + 1, gerador.nextInt(50) + 1));
			
	}

}
