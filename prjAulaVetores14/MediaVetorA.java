package prjAulaVetor;
import java.util.Scanner;
public class MediaVetorA {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		final int TAM = 10;
		int a[], i;
		double total =0, media;
		
		a = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A:");
			a[i] = leia.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			total = total+a[i];
		}
		
		
		System.out.println("O total dos valores de A é: "+total);
		
		media = total/TAM;
		
		System.out.println("A média dos valores de A é: "+media);
		
		leia.close();
	}

}
