package prjAulaRemotaVetores;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=5;
		int a[], i, j=1, busca;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A");
			a[i] = ler.nextInt();
		}
		
		System.out.println("Digite o número inteiro que deseja procurar:");
		busca = ler.nextInt();
		
		for(i=0; i<TAM; i++) {
			
			if(j==TAM) {
				System.out.println("Valor não encontrado");
			}
			
			if (busca==a[i]) {
				System.out.println("Valor Encontrado");
			}else {
				j=j+1;
			}
		}
	}
}