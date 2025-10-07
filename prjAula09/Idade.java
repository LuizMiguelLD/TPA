package prjListaPara;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double altura, peso, mAltura, tAltura=0, qntPessoaPeso=0, pPeso;
		int i, idade, idadeMaior, idadeMenor, qntPessoaIdade=0, qntPessoaAltura=0;
		
		idadeMaior=-1;
		idadeMenor=1000;
		
		for(i=1;i<=25;i++) {
			
			System.out.println(i+"o pessoa");
			System.out.println("Digite a idade:");
			idade = leia.nextInt();
			
			System.out.println("Digite a altura:");
			altura = leia.nextDouble();
			
			System.out.println("Digite a peso:");
			peso = leia.nextDouble();
			
			if(idade>50) {
				qntPessoaIdade++;
			}
			
			if(idade>=10 && idade<=20) {
					qntPessoaAltura++;
					tAltura= tAltura+altura;
			}
			
			if(peso<40) {
				qntPessoaPeso++;
			}
			
			if(idade>idadeMaior) {
				idadeMaior=idade;
			}
			if (idade<idadeMenor) {
				idadeMenor=idade;
			}
		}
		
		pPeso = (qntPessoaPeso/25)*100;
		mAltura = tAltura/qntPessoaAltura;
		
		System.out.println("Quantidade de pessoas maiores que 50 anos: "+qntPessoaIdade);
		System.out.println("Média da altura das pessoas entre 10 e 20 anos: "+mAltura);
		System.out.println("Porcentagem de pessoas abaixo de 40kg: "+pPeso+"%");
		System.out.println("A maior idade entre as pessoas é: "+idadeMaior);
		System.out.println("A menor idade entre as pessoas é: "+idadeMenor);
	}

}
