package prjAulaRemotaVetores;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A");
			a[i] = ler.nextInt();
		}
	
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de B");
			b[i] = ler.nextInt();
		}
				
		for(i=0; i<TAM; i++) {
			if(a[i]>b[i]) {
				c[i] = 1;
			}else if(a[i]<b[i]) {
				c[i] = -1;
			}else {
				c[i] = 0;
			}
		}
		
		System.out.print("C = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");	
		
		ler.close();
	}

}