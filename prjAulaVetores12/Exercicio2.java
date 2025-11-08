package prjAulaRemotaVetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=5;
		int a[], i, j;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A");
			a[i] = ler.nextInt();
		}
		
		for (j=0; j<TAM; j++) {
			System.out.println("Tabuada do "+a[j]);
			for(i=1; i<11; i++) {
				System.out.println(a[j]+"*"+i+"="+a[j]*i);
			}
		}
		ler.close();
	}

}