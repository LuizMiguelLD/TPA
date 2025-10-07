package prjListaExercicios;
import java.util.Scanner;
		
public class irpf {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);   
		double salario, irpf;
		
		System.out.println("Insira o seu salário:");
		salario = leia.nextDouble();
		
		if (salario>2866.71) {
			irpf = (salario*(27.5/100))-662.94;
			System.out.println("O seu desconto IRPF é de: "+irpf+"R$");
		} else if (salario>2150.01) {
			irpf = (salario*(22.5/100))-483.84;
			System.out.println("O seu desconto IRPF é de: "+irpf+"R$");			
		} else if (salario>1434.60) {
			irpf = (salario*(7.5/100))-268.84;
			System.out.println("O seu desconto IRPF é de: "+irpf+"R$");
		} else {
			System.out.println("Sem desconto IRPF");
		}
	}
}
