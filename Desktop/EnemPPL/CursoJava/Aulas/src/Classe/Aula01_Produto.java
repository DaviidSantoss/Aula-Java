package Classe;

public class Aula01_Produto {

	/*Aqui criamos uma classe definindo o "nome" como uma "String"
	 * o "preco" como um "double" e o "desconto" como um "double",para
	 * então podermos usar os obejtos dessa classe em outros projetos.*/
	String nome;
	double preco;
	final static double DESC = 0.25;
	
	
	Aula01_Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		
		
	}
	
	Aula01_Produto(){
		
	}
	
	double precoComDesconto() {
		
		return (1 - DESC) * preco;
	}
	
}
