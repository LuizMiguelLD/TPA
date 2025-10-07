package prjListaExercicios;
import java.util.Scanner;

public class combustivel {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double kilometros, capacidadeCombustivel, gastoMedio;
		
		System.out.println("Leia a distância percorrida em Km:");
		kilometros = leia.nextDouble();
		
		System.out.println("Leia a capacidade do combustível em L:");
		capacidadeCombustivel = leia.nextDouble();
		
		gastoMedio = kilometros/capacidadeCombustivel;
		
		System.out.println("O gasto médio é "+gastoMedio+"Km/L");
		
		if (gastoMedio>=10) {
			System.out.println("Econômico");
		}else {
			System.out.println("Não econômico");
		}
	}
}
