package exercicio3;

public class main {

	public static void main(String[] args) {
		SistemaArquivo sistema = new SistemaArquivo();
		
		try {
			sistema.criarDocumento("relatorio", "Area de Trabalho", "dsdjsadjiasfj");
			System.out.println("Arquivo criado com sucesso.");
		}catch (NomeInvalidoException nie) {
			System.err.println(nie.getMessage());
		}
		try {
			sistema.criarMusica("Dia Azul", "Area de Trabalho", 199);
			System.out.println("Arquivo criado com sucesso.");
		}catch (NomeInvalidoException nie) {
			System.err.println(nie.getMessage());
		}
		try {
			sistema.criarMusica("Aviao sem Asa", "Area de Trabalho", 158);
			System.out.println("Arquivo criado com sucesso.");
		}catch (NomeInvalidoException nie) {
			System.err.println(nie.getMessage());
		}
		try {
			sistema.criarDocumento("Lista de Compras", "Area de Trabalho", "dsdjsadjiasfj");
			System.out.println("Arquivo criado com sucesso.");
		}catch (NomeInvalidoException nie) {
			System.err.println(nie.getMessage());
		}
		try {
			sistema.criarMusica("Aquarela", "Area de Trabalho", 260);
			System.out.println("Arquivo criado com sucesso.");
		}catch (NomeInvalidoException nie) {
			System.err.println(nie.getMessage());
		}
		
		try {
			sistema.criarDocumento("relatorio", "Documentos", "dsdjsadjiasfj");
			System.out.println("Arquivo criado com sucesso.");
		}catch (NomeInvalidoException nie) {
			System.err.println(nie.getMessage());
		}
		try {
			sistema.criarMusica("Dia Azul", "Documentos", 199);
			System.out.println("Arquivo criado com sucesso.");
		}catch (NomeInvalidoException nie) {
			System.err.println(nie.getMessage());
		}
		try {
			sistema.criarMusica("Aviao sem Asa", "Documentos", 158);
			System.out.println("Arquivo criado com sucesso.");
		}catch (NomeInvalidoException nie) {
			System.err.println(nie.getMessage());
		}
		try {
			sistema.criarDocumento("Lista de Compras", "Documentos", "dsdjsadjiasfj");
			System.out.println("Arquivo criado com sucesso.");
		}catch (NomeInvalidoException nie) {
			System.err.println(nie.getMessage());
		}
		try {
			sistema.criarMusica("Aquarela", "Documentos", 260);
			System.out.println("Arquivo criado com sucesso.");
		}catch (NomeInvalidoException nie) {
			System.err.println(nie.getMessage());
		}
	}

}
