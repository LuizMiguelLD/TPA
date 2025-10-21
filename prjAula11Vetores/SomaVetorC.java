package prjAulaVetor;
import java.util.Scanner;
public class SomaVetorC {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		  
		final int TAM = 10;
		int a[], b[], c[], i;
		
		a = new int [TAM];
		b= new int [TAM];
		c = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor A");
			a[i] = leia.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor B");
			b[i] = leia.nextInt();
			c[i] = a[i]+b[i];
		}
		
		//valor de A
		System.out.print("O valor de A: [ ");
		
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("]");
		//valor de B
		System.out.print("O valor de B: [ ");
		
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.println("]");
	   //valor de C
		System.out.print("O valor de C: [ ");
		
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+" ");
		}
		
		System.out.print("]");
		
		leia.close();
	}

}
