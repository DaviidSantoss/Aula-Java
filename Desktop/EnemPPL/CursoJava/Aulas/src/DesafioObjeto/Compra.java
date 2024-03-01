package DesafioObjeto;

import java.util.ArrayList;

public class Compra {
	//Criamos um novo objeto item
	Item item = new Item();
	
	//Instanciamos a classe cliente
	Cliente cliente;
	
	//Criamos um novo objeto produto
	Produto produtos = new Produto();
	
	//lista de itens
	ArrayList<Item> itens = new ArrayList<Item>();
	
	//adicionei item a lista chamada "itens"
	//e adicion compra a "item"
	void additem(Item item) {
		itens.add(item);
		item.compra = this;
	}

		//construtor para adicionar os itens mais facil
		Compra(String nome, int quantidade,double preço){
		produtos.nome = nome;
		item.quantidade = quantidade;
		produtos.preço = preço;
	}
	
	
}
