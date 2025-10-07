package prjAula01;

public class CalculoIdade {
	public static void main(String[] args) {
		//Declaração de variáveis
		int anoAtual, anoNascimento, idade;
		anoAtual = 2025;
		anoNascimento = 1500;
		
		//Cálculo idade
		idade = anoAtual-anoNascimento;
		System.out.println("A idade da pessoa é "+idade);
	}
}
