package exercicio4;

import java.util.Random;

public class Sorteador {
	private Pessoa pessoas[] = new Pessoa[10];
	
	public Pessoa sortearProximo() {
		Random gerador = new Random();
		int posSorteio = gerador.nextInt(pessoas.length);
		Pessoa pessoa = pessoas[posSorteio];
		Pessoa pessoasNew[] = new Pessoa[pessoas.length-1];
		int cont = 0;
		for(int i=0; i<pessoas.length; i++) {
			if(i != posSorteio) {
				pessoasNew[cont] = pessoas[i];
				cont++;
			}
		}
		pessoas = pessoasNew;
		return pessoa;
	}
}
