package prjListaExercicios;
import java.util.Scanner;

public class ordemCrescente {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite o valor de A:");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B:");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de C:");
		c = leia.nextInt();
		
		if(a>b) {
			if(a<c) {
				if(b>c) {
					System.out.println(c+", "+b+", "+a);
				}else {
					System.out.println(b+", "+c+", "+a);
				}
			}else {
				System.out.println(b+", "+c+", "+a);
			}
		}else if(b>c) {
			if(a>c) {
				System.out.println(c+", "+a+", "+b);	
				}else {
					System.out.println(a+", "+c+", "+b);
				}
			}else {
				System.out.println(a+", "+b+", "+c);
			}
		leia.close();
	}
}
