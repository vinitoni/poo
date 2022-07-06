package exercicio3;

import java.util.LinkedList;
import java.util.List;

public class Cliente implements Observador{
	private List<String> mensagens = new LinkedList<String>();
	
	public void atualizar(Object objeto) {
		if(objeto instanceof String)
			mensagens.add((String) objeto);
	}

	public List<String> getMensagens() {
		return mensagens;
	}
	
}
