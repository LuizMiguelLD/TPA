package prjAula01;

public class CalculoIdade {
	public static void main(String[] args) {
		//Declara��o de vari�veis
		int anoAtual, anoNascimento, idade;
		anoAtual = 2025;
		anoNascimento = 1500;
		
		//C�lculo idade
		idade = anoAtual-anoNascimento;
		System.out.println("A idade da pessoa � "+idade);
	}
}
