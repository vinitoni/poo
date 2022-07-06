public class Exercicio3 {

	public static void main(String[] args) {
		
		int v[] = {3,2,5,6,4};
		
		int maior = buscaMaior(v,v[v.length-1],v.length-1);
		
		System.out.print(maior);
		
	}
	
	public static int buscaMaior(int vetor[], int maiorAtual, int indice) { // passar como parâmetros: (vetor a ser buscado, vetor[vetor.length-1], vetor.length-1)
		
		if(indice == 0)
			return vetor[0];
		
		int n1 = buscaMaior(vetor,vetor[indice],indice-1);
		
		if(maiorAtual > n1)
			return maiorAtual;
			else 
				return n1;
	}
}
