package exercicio3;

public abstract class Arquivo {
	private String nome;
	private String extensao;
	
	public Arquivo(String nome) throws NomeInvalidoException{
		if(nome.length()>=10 && nome.length()<=256)
			for(int i=0;i<nome.length();i++) {
				char letra = nome.charAt(i);
				if(letra == '\n' || letra == '[' || letra == ']' || letra == '(' || letra == ')' || letra == (char) 40 || letra == (char) 34)
					throw new NomeInvalidoException("Nome de arquivo invalido.");
			}
		else
			throw new NomeInvalidoException("Nome de arquivo invalido.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}
}
