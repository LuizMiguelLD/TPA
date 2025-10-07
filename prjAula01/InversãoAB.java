package prjAula01;

public class InversãoAB {
	public static void main(String[] args) {
		//Declaração de variáveis
		int valorA, valorB, valorC;
		
		valorA = 1;
		valorB = 5;
		//Inversão de valores
		
		valorC = valorB;
		valorB = valorA;
		valorA = valorC;
		
		System.out.println("Os valores convertidos são"+valorA+valorB);
	}
}
