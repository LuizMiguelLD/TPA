package prjAula01;

public class Invers�oAB {
	public static void main(String[] args) {
		//Declara��o de vari�veis
		int valorA, valorB, valorC;
		
		valorA = 1;
		valorB = 5;
		//Invers�o de valores
		
		valorC = valorB;
		valorB = valorA;
		valorA = valorC;
		
		System.out.println("Os valores convertidos s�o"+valorA+valorB);
	}
}
