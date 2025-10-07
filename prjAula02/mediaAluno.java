package prjListaExercicios;
import java.util.Scanner;

public class mediaAluno {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, media, media2, exame;
		
		System.out.println("Digite a primeira nota do aluno:");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno:");
		nota2 = leia.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if(media<3) {
			System.out.println("Reprovado");	
		}else if (media>=3) {
			if (media<6) {
				System.out.println("Digite a nota do exame do aluno:");
				exame = leia.nextDouble();
				
				media2 = (media+exame)/2;
				if (media2>=6) {
					System.out.println("Aprovado");
				}else {
					System.out.println("Reprovado");
				}
			}else {
				System.out.println("Aprovado");
			}
		}
	}
}
