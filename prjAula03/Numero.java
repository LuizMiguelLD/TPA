package prjAula04Condicao;
import java.util.Scanner;

public class Numero {
	public static void main(String[] args) {
		//Scanner
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		double numero;
		
		//Leia número
		System.out.println("Digite o número: ");
		numero = leia.nextDouble();
		
		if (numero < 0) { //Se o número é menor que 0
			System.out.println("O número é negativo");
		} else if (numero == 0) { //Se o número é igual a 0
			System.out.println("O número é nulo");	
		} else {//Se o número é maior que 0
			System.out.println("O número é positivo");
		}
	}
}
