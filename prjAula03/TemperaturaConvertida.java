package prjAula04Condicao;
import java.util.Scanner;

public class TemperaturaConvertida {
	public static void main(String[] args) {
		//Scanner
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		double c, f;
		
		//leia Fahrenheit
		System.out.println("Digite a temperatura de Fahrenheit: ");
		f = leia.nextDouble();
		
		//Conversão F para C
		c = (f-32)*5/9;
		if (c<15) { //Se for menor que 15
			System.out.println("Frio");
		} else if (c == 15) { //Se for igual a 15
			System.out.println("Ameno");
		} else if (c < 22) { //Se for menor que 22
			System.out.println("Ameno");
		} else if (c>=22) { //Se for maior que 22
			System.out.println("Calor");
		}
	}
}
