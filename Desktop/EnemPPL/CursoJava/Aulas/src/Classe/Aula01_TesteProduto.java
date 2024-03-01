package Classe;


public class Aula01_TesteProduto {

	public static void main(String[] args) {
		
		/*Aqui utilizamos a classe produto para poder criar
		 * novos objetos*/
		
		Aula01_Produto p1 = new Aula01_Produto("Notebook",1500);
		Aula01_Produto p2 = new Aula01_Produto("Moto g60",1100);
		
	

		
		//double precofinal2 = p2.preco * (1 - p2.desconto);
		//double media = (precofinal +  precofinal2) / 2;
		System.out.println("O preço Bruto do "+ p1.nome+" é "+p1.preco);
		System.out.println("O preço do "+p1.nome+" Com "+Aula01_Produto.DESC+" de desconto é "+p1.precoComDesconto());
		
		System.out.println("\nO preço Bruto do "+ p2.nome+" é "+p2.preco);
		System.out.println("O preço do "+p2.nome+" Com "+Aula01_Produto.DESC+" de desconto é "+p2.precoComDesconto());
		
		
		
		
	}
}
