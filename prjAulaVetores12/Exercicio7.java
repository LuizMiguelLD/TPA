package prjAulaRemotaVetores;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=15;
		int a[], b[], i, j, fat;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A");
			a[i] = ler.nextInt();
			b[i] = a[i];
		}
		
		for(i=0; i<TAM; i++) {
			fat = 1;
			j = 1;
			do {
				fat = fat*j;
				j++;
			}while(j<=b[i]);
			b[i] = fat;
		}
		
		System.out.print("A = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
		
		System.out.print("B = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");
	}
}