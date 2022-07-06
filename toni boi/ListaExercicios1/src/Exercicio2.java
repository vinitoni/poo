import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Random gerador = new Random();
		Scanner s = new Scanner(System.in);
		
		int num = Integer.parseInt(s.nextLine());
		
		int m1[][] = new int [num][num];
		int m2[][] = new int [num][num];
		int m3[][] = new int [num][num];
		int m4[][] = new int [num][num];
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				m1[i][j] = gerador.nextInt();
				m2[i][j] = gerador.nextInt();
			}
		}
		
		int menor = m1[0][0];
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(m1[i][j] > m2[i][j]) {
					m3[i][j] = m1[i][j];
				} else {
					m3[i][j] = m2[i][j];
				}
				if(m1[i][j] < menor) {
					menor = m1[i][j];
				}
				if(m2[i][j] < menor) {
					menor = m2[i][j];
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j >= i) {
					m4[i][j] = 0;
				}
				if(i > j) {
					m4[i][j] = menor;
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print(m3[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print(m4[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
