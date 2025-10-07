package prjAula05;
import java.util.Scanner;

public class SalarioPessoa {
	public static void main(String[] args) {
		
		//Criando comando leia
		Scanner leia = new Scanner (System.in);
		
		//declarando variáveis
		double salarioLiquido, salarioBruto, descontoTransporte = 0.06, descontoInss = 0.08;
	
		System.out.println("Digite o seu salário bruto:");
		salarioBruto = leia.nextDouble(); //lendo salário bruto
		
		 //cálculo do salário liquído
		salarioLiquido = salarioBruto-(salarioBruto*descontoInss*descontoTransporte);
		
		System.out.println("Seu salário liquído é: "+salarioLiquido);
		
		leia.close();
		
		
	}
	

}
