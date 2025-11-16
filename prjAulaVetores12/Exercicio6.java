package prjAulaRemotaVetores;

public class Exercicio6 {

	public static void main(String[] args) {
		final int TAM=11;
		int a[], i, j, resultado;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			a[i] = 2;
		}
		
		System.out.print("A = [ ");
		for(i=0; i<TAM; i++) {
			j = 1;
			resultado = 1;
			while(j<=i) {
				resultado = resultado*a[i];
				j++;
			}
			System.out.print(resultado+" ");
		}
		System.out.print("]");
	}

}