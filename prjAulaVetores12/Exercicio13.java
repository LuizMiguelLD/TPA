package prjAulaRemotaVetores;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], i, j, contagem=0;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			j = TAM-1-i;
			if(a[i]==a[j]) {
				contagem++;
			}
		}
		
		if (contagem==TAM) {
			System.out.println("O vetor é um palíndromo");
		}else {
			System.out.println("O vetor não é um palíndromo");
		}
		
		ler.close();
	}

}
