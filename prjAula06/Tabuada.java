package prjLacos;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i=1, n;
		
		System.out.println("Digite o número inteiro:");
		n = leia.nextInt();
		
		System.out.println("A tabuada de "+n+" é:");
		while(i<=10) {
			System.out.println(n+" x "+i+" = "+n*i);
			i++;
		}
		leia.close();
	}
}
