package prjAulaRemotaVetores;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i;
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
			if (a[i]==b[i]) {
				System.out.print(b[i]+" ");
			}
		}
		System.out.print("]");	
		
		ler.close();
	}

}