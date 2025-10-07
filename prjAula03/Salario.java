package prjAula04Condicao;
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		//Scanner
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		double salario;
		
		//Leia Salário
		System.out.println("Digite seu salário: ");
		salario = leia.nextDouble();
		
		if (salario<1302.00){ //Se salário é menor que 1302.00
			System.out.println("Seu salário esta abaixo do salário mínimo");
		}else { //Se o salário é maior que 1302.00
			System.out.println("Seu salário esta acima do salário mínimo");
		}
	}
}
