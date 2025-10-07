package prjListaExercicios;
import java.util.Scanner;

public class triangulo {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Escreva o valor de A:");
		a = leia.nextDouble();
		
		System.out.println("Escreva o valor de B:");
		b = leia.nextDouble();
		
		System.out.println("Escreva o valor de C:");
		c = leia.nextDouble();
		
		if(a>b+c || b>a+c || c>a+b ) {
			if (a==b && b==c) {
				System.out.println("Triângulo equilátero");
			}else if (a==b || b==c){
				System.out.println("Triângulo escaleno");
			}else {
				System.out.println("Triângulo isósceles");
			}
		}else {
			System.out.println("Não é um triângulo");
		}
	}
}
