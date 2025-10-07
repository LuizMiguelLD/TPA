package prjAula12FaçaEnquanto;

import java.util.Scanner;

public class DesejaContinuar {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int i=1;
		double n1, n2, m;
		
		do {
			System.out.println("Digite a primeira nota do aluno:");
			n1 = ler.nextDouble();
			
			System.out.println("Digite a segunda nota do aluno: ");
			n2 = ler.nextDouble();
			
			m=(n1+n2)/2;
			
			if(m>=6) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
			
			System.out.println("Deseja continuar? 1-Sim 2-Não");
			i = ler.nextInt();
			
		} while(i==1);
		System.out.println("Execução encerrada");
		ler.close();
	}
}
