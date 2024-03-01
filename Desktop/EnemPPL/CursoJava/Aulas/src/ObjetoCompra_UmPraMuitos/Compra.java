package ObjetoCompra_UmPraMuitos;

import java.util.ArrayList;

public class Compra {
	
	//Para representar o nome do cliente
	String cliente;
	
	/*1-Criamos um "ArrayList" do tipo "Item" com o nome de "itens",
	 *sendo assim, relacionamos a classe "Item" com a classe "Compra"
	 *e esse relacionamento é do tipo um pra muitos, por isso utilizamos
	 *um "Arraylist"*/
	ArrayList<Item> itens = new ArrayList<Item>();
	
	//2-Aqui fizemos um realação biderecional utilizando o
	//método "adicionarItem" para adicionar um "item" à lista de "itens"
	//através do comando "void adicionarItem(Item item)", logo após isso
	//adicionamos o "item" a lista de "itens" através do comando "itens.add(item);"
	//e por ultima associamos "compra" que é nossa classe atual a "item"
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra= this;
	}
	
	//3-Esse método chamou o método de cima para poder adicionar as informações
	//dos itens de uma forma mais facíl, e para não precisarmos criar um novo
	//objeto todas vez que formos adicionar um item utilizamos o comando 
	//"this.adicionarItem((new Item(nome,quantidade,preço)));" que cria os
	//objetos necessários todas ves que chamarmos o metodo "adicionarItem"
	void adicionarItem(String nome, int quantidade,double preço) {
		this.adicionarItem((new Item(nome,quantidade,preço)));
	}
	
	/* 4-Criamos um método para nos retornar o valor da compra total, para fazer
	 * isso criamos um "Método" chamado "valortotal", e dentro dele criamos um 
	 * for-each que ira percorrer todo o objeto "itens" e adicionar os valores
	 * encontrados dentro de "item", logo após isso ele multiplica a quantidade
	 * pelo preço e adiciona o resultado dentro da variável "total",e em seguida
	 * retorna o valor da variável "total"*/
	double valortotal () {
		double total = 0;
		for(Item item: itens) {
		total += item.quantidade * item.preço;
		}
		return total;
	}

}
