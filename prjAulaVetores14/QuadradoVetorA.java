package prjAulaVetor;

import java.util.Scanner;

public class QuadradoVetorA {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		
		int a[], b[], i;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"o. valor do vetor A");
			a[i] = ler.nextInt();
			
		}
	
		System.out.println("Os valores de A:");
		
		System.out.print("A = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
	
		System.out.println("Os valores de B:");
		
		System.out.print("B = [ 1");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]*a[i]+" ");
		}
		System.out.print("]");
		
		ler.close();
	}

}
