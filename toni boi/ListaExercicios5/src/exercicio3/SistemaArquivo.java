package exercicio3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SistemaArquivo {
	private Map<String,List<Arquivo>> diretorios = new HashMap<String,List<Arquivo>>();
	
	public void criarDocumento(String nome, String diretorio, String texto) throws NomeInvalidoException{
		Arquivo arquivo = new Documento(nome,texto);
		
		if(diretorios.get(diretorio) == null) {
			diretorios.put(diretorio, new LinkedList<Arquivo>());
			diretorios.get(diretorio).add(arquivo);
		}else
			diretorios.get(diretorio).add(arquivo);
	}
	
	public void criarMusica(String nome, String diretorio, int duracao) throws NomeInvalidoException{
		Arquivo arquivo = new Musica(nome,duracao);
		
		if(diretorios.get(diretorio) == null) {
			diretorios.put(diretorio, new LinkedList<Arquivo>());
			diretorios.get(diretorio).add(arquivo);
		}else
			diretorios.get(diretorio).add(arquivo);
	}
	
	public void criarVideo(String nome, String diretorio, Qualidade qualidade) throws NomeInvalidoException{
		Arquivo arquivo = new Video(nome,qualidade);
		
		if(diretorios.get(diretorio) == null) {
			diretorios.put(diretorio, new LinkedList<Arquivo>());
			diretorios.get(diretorio).add(arquivo);
		}else
			diretorios.get(diretorio).add(arquivo);
	}
	
	public String toString(){
		String retorno = "";
		Set<String> chaves = diretorios.keySet();
		for(String chave: chaves) {
			if(chave != null) {
				retorno += "\n" + chave + "\n";
				List<Arquivo> arquivos = diretorios.get(chave);
				for(Arquivo arquivo: arquivos) 
					retorno += "	" + arquivo.toString() + "\n";
			}
		}
		return retorno;
	}
}
