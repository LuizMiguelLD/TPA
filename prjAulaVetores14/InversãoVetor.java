package prjAulaVetor;

import java.util.Scanner;

public class InversãoVetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A:");
			a[i] = leia.nextInt();
		}
		
		System.out.print("O valor de A: [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("]");
		
		System.out.print("O valor de B: [ ");
		for(i=TAM-1; i>0; i--) {
			b[i] = a[i];
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		
		leia.close();
	}

}
