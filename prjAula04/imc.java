package prjListaExercicios;
import java.util.Scanner;

public class imc {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.println("Digite seu peso");
		peso = leia.nextDouble();
		
		System.out.println("Digite sua altura");
		altura = leia.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.println("O seu IMC é de: "+imc);
		if(imc<18.5) {
			System.out.println("Excesso de magreza");
		}else if(imc<=25) {
			System.out.println("Peso Normal");
		} else if(imc<=30) {
			System.out.println("Excesso de peso");
		} else if(imc<=35) {
			System.out.println("Obesidade Grau 1");
		} else if(imc<=40) {
			System.out.println("Obesidade Grau 2");
		} else {
			System.out.println("Obesidade Grau 3");	
		}
		leia.close();
	}
}
