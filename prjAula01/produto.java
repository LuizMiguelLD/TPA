package prjAula05;
import java.util.Scanner;
public class produto {
	public static void main(String[] args) {
		
		//declarando variáveis
		double precoProduto, quantiProduto,vendaProduto, lucroProduto;
		
		//criando comando leia
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o preço do produto:");
		precoProduto = leia.nextDouble();//lendo o preço do produto
		
		System.out.println("Digite a quantidade vendida do produto:");
		quantiProduto = leia.nextDouble();//lendo a quantidade de venda do produto
		
		System.out.println("Digite o preço de venda do produto:");
		vendaProduto = leia.nextDouble();//lendo o preço de venda do produto
		
		lucroProduto = (vendaProduto*quantiProduto)-(precoProduto*quantiProduto); //calculando lucro do produto
		
		System.out.println("O lucro obtido com a venda do produto é: "+lucroProduto);
		
		leia.close();
		
	}

}
