package prjListaExercicios;
import java.util.Scanner;

public class raizReal {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double a, b, c, delta, raiz1, raiz2;
		
		System.out.println("Digite o valor de A:");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B:");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de C:");
		c = leia.nextDouble();
		
		delta = (b*b)-4*a*c;
		
		if(delta<0) {
			System.out.println("Não existe raízes reais");
		}else if(delta==0) {
			raiz1 = (-b+Math.sqrt(delta))/(2*a);
			System.out.println("A única raiz é"+raiz1);
		}else {
			raiz1 = (-b+Math.sqrt(delta))/(2*a);
			raiz2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.println("A primeira raiz é: "+raiz1+"e a segunda raiz é: "+raiz2);
		}
		leia.close();
	}
}
