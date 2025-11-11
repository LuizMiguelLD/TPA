package prjAulaRemotaVetores;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i, j, k;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A");
			a[i] = ler.nextInt();
		}
	
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de B");
			b[i] = ler.nextInt();
		}
		
		System.out.print("C = [ ");		
		for(i=0; i<TAM; i++) {
			k=0;
			for(j=0; j<TAM; j++) {
				if (a[i]==b[j]) {
					k++;
				}
			}
			if (k==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.print("]");	
		
		ler.close();
	}

}