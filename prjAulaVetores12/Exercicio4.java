package prjAulaRemotaVetores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], i, j;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Relação dos pares até o número "+a[i]);
			for(j=0; j<=a[i] ; j=j+2) {
				System.out.println(j);
			}
		}
		
		ler.close();
	}

}