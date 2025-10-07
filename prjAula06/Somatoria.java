package prjLacos;

import java.util.Scanner;

public class Somatoria {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i=1, j=1;
		
		while(i<=5050) {
			System.out.println(i);
			j=j+1;
			i=i+j;	
		}
		leia.close();
	}

}
