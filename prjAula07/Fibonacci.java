package prjAula12FaçaEnquanto;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int i=1, n, antecessor=0, sucessor, atual=1;
		
		System.out.println("Digite um número inteiro:");
		n = ler.nextInt();
		
		do {
			System.out.print(atual+" ");
			sucessor = atual+antecessor;
			antecessor = atual;
			atual = sucessor;
			i++;
		}while(i<=n);
		
		ler.close();
	}
}
