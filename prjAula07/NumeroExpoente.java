package prjAula12FaçaEnquanto;

import java.util.Scanner;

public class NumeroExpoente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i=1, base, expo, resultado=1;
		
		System.out.println("Digite a base");
		base = leia.nextInt();
		
		System.out.println("Digite o expoente");
		expo = leia.nextInt();
		
		
		do {
			resultado = resultado*base;
			i++;
		}while(i<=expo);
		
		System.out.println("O resultado é "+resultado);
		
		leia.close();
	}

}
