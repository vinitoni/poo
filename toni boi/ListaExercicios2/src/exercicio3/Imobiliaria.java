package exercicio3;

public class Imobiliaria {
	private String nome;
	private Imovel imoveis[] = new Imovel[10];
	private int quantImoveis = 0;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantImoveis() {
		return quantImoveis;
	}
	
	public void addImovel(Imovel imovel) {
		imoveis[quantImoveis] = imovel;
		quantImoveis++;
	}
	
	public String toString() {
		String lista = "";
		for(int i=0;i<quantImoveis;i++) {
			lista += "\nImóvel " + (i+1) + ":";
			lista += imoveis[i].toString();
		}
		return lista;
	}
	
	public Imovel[] filtrarPorArea(float x) {
		int cont = 0;
		for(int i=0;i<quantImoveis;i++) {
			if(imoveis[i].calculaArea() >= x)
				cont++;
		}
		Imovel imoveisAreaMaior[] = new Imovel[cont];
		cont = 0;
		for(int i=0;i<quantImoveis;i++) {
			if(imoveis[i].calculaArea() >= x) {
				imoveisAreaMaior[cont] = imoveis[i];
				cont++;
			}
		}
		for (int i = 1; i < imoveisAreaMaior.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (imoveisAreaMaior[i].getValor() > imoveisAreaMaior[j].getValor()) {
		            Imovel temp = imoveisAreaMaior[i];
		            imoveisAreaMaior[i] = imoveisAreaMaior[j];
		            imoveisAreaMaior[j] = temp;
		        }
		    }
		}
		return imoveisAreaMaior;
	}
}
