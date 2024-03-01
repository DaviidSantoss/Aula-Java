package Treino1PRAMUITOS;

public class Item {
	
	String nome;
	int quantidade;
	double preço;
	Compra compra;
	
	//Iremos criar um construtor contendo as tres 
	//variáveis, nome,quantidade e preço, para que 
	//a construção dos itens fiquem mais facil
	
	Item(String nome, int quantidade, double preço){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preço = preço;
	}

}
