package prjListaExercicios;
import java.util.Scanner;

public class idade {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int idade, anoNascimento, anoAtual;
		
		System.out.println("Leia o ano de nascimento:");
		anoNascimento = leia.nextInt();
		
		System.out.println("Leia o ano atual:");
		anoAtual = leia.nextInt();
		
		idade=anoAtual-anoNascimento;
		
		System.out.println("Sua idade é: "+idade);
		System.out.println("Então você é considerado(a):");
		
		if(idade<10) {
			System.out.println("Criança");
		}else if(idade<18) {
			System.out.println("Adolescente");
		}else if (idade>=18) {
			if(idade<60) {
				System.out.println("Adulto");
			}else {
				System.out.println("Idoso");
			}
		}
	}
}
