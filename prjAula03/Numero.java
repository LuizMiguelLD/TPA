package prjAula04Condicao;
import java.util.Scanner;

public class Numero {
	public static void main(String[] args) {
		//Scanner
		Scanner leia = new Scanner(System.in);
		
		//Vari�veis
		double numero;
		
		//Leia n�mero
		System.out.println("Digite o n�mero: ");
		numero = leia.nextDouble();
		
		if (numero < 0) { //Se o n�mero � menor que 0
			System.out.println("O n�mero � negativo");
		} else if (numero == 0) { //Se o n�mero � igual a 0
			System.out.println("O n�mero � nulo");	
		} else {//Se o n�mero � maior que 0
			System.out.println("O n�mero � positivo");
		}
	}
}
