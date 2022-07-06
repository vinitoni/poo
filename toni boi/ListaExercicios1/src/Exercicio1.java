import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int menor=0,maior=0,soma=0,somap=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite quantos valores deseja:");
		int num = Integer.parseInt(s.nextLine());
		int vet[] = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("Digite o " + (i+1) + "o valor:");
			vet[i] = Integer.parseInt(s.nextLine());
			soma += vet[i];
			if(i == 0) {
				maior = vet[0];
				menor = vet[0];
			}
			if(vet[i] < menor) {
				menor = vet[i];
			}
			if(vet[i] > maior) {
				maior = vet[i];
			}
			if(vet[i] > 1) {
				int notPrime = 0;
				for(int j=2;j<Math.sqrt(vet[i]);j++) {
					if(vet[i] % j == 0){ 
						notPrime = 1; 
						break; 
					}
					
				}
				if(notPrime == 0) {
					somap += vet[i];
				}
			}
		}
		
		System.out.println("Soma dos elementos desse vetor: " + soma);
		System.out.println("Menor valor do vetor: " + menor);
		System.out.println("Maior valor do vetor: " + maior);
		System.out.println("Média dos elementos do vetor: " + soma * 1.0/num);
		System.out.println("Soma dos números primos existentes no vetor: " + somap);
	}
	
}
