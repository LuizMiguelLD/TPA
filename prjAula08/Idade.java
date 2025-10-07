package prjListaTpaLaco;
import java.util.Scanner;
public class Idade {
	public static void main(String args[]) {
		Scanner leia = new Scanner (System.in);
		
		double qntPessoa, f1=0, f2=0, f3=0, f4=0, f5=0, p1, p2, p3, p4, p5;
		int  i, idade;
		
		do {
			System.out.println("Digite a idade:");	
			idade = leia.nextInt();
			
			if (idade<=15) {
				f1=f1+1;
			}else if (idade<=30) {
				f2=f2+1;
			}else if (idade<=45) {
				f3=f3+1;
			}else if (idade<=60) {
				f4=f4+1;
			}else {
				f5=f5+1;
			}
			
			System.out.println("Deseja continuar? 1-Sim 2-Não");
			i = leia.nextInt();
		}while(i==1);
		
		qntPessoa=f1+f2+f3+f4+f5;
		
		p1=(f1/qntPessoa)*100;
		p2=(f2/qntPessoa)*100;
		p3=(f3/qntPessoa)*100;
		p4=(f4/qntPessoa)*100;
		p5=(f5/qntPessoa)*100;
		
		System.out.println("Faixa 1: "+f1);
		System.out.println("Faixa 2: "+f2);
		System.out.println("Faixa 3: "+f3);
		System.out.println("Faixa 4: "+f4);
		System.out.println("Faixa 5: "+f5);
		
		System.out.println("Porcentagem 1: "+p1+"%");
		System.out.println("Porcentagem 2: "+p2+"%");
		System.out.println("Porcentagem 3: "+p3+"%");
		System.out.println("Porcentagem 4: "+p4+"%");
		System.out.println("Porcentagem 5: "+p5+"%");
		
		leia.close();
	}
}
