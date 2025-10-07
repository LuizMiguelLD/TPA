package prjLacos;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i=1, qntMenor=0, qntMaior=0, idade; 
	
		while (i<=5) {
			System.out.println("Digite a idade da "+i+"o pessoa:");
			idade = leia.nextInt();
			
			if (idade>=18) {
				qntMaior+=1;
			}else {
				qntMenor+=1;
			}
			
			i++;
		}
		System.out.println("A quantidade de maiores de idade é de: "+qntMaior+" pessoa(s)");
		System.out.println("A quantidade de menores de idade é de: "+qntMenor+" pessoa(s)");
		leia.close();
	}
}
