package prjAula04Condicao;
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		//Scanner
		Scanner leia = new Scanner(System.in);
		
		//Vari�veis
		double salario;
		
		//Leia Sal�rio
		System.out.println("Digite seu sal�rio: ");
		salario = leia.nextDouble();
		
		if (salario<1302.00){ //Se sal�rio � menor que 1302.00
			System.out.println("Seu sal�rio esta abaixo do sal�rio m�nimo");
		}else { //Se o sal�rio � maior que 1302.00
			System.out.println("Seu sal�rio esta acima do sal�rio m�nimo");
		}
	}
}
