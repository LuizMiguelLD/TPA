package prjListaTpaLaco;

public class Altura {
	public static void main(String args[]) {
		double i=1, alturaPedro=1.45, alturaJoao=1.34;
		
		do {
			alturaPedro = alturaPedro+0.02;
			alturaJoao = alturaJoao+0.025;
			i++;
		}while(alturaPedro>alturaJoao);
		
		System.out.println("Vai demorar "+i+" anos para João passar Pedro");
	}
}
