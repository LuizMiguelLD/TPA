package prjAula12FaçaEnquanto;

import java.util.Scanner;

public class NumeroFatorial {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i=1, n, fat=1;
		
		System.out.println("Digite um número inteiro");
		n = leia.nextInt();
		
		do {
			fat = i*fat;
			i++;
		} while(i<=n);
		
		System.out.println("O fatorial de "+n+" é "+fat);
		
		leia.close();
	}

}
