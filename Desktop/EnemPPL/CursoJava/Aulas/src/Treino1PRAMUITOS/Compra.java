package Treino1PRAMUITOS;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	/*Com a criação desta lista criamos uma relação 1 pra N,
	 *ou seja, 1 compra tem varios itens, e um item pertence 
	 *a uma compra.*/
	ArrayList<Item> itens = new ArrayList<Item>();
	
		/*Criamos um método "additem" que nos ajuda a adicionar
		 *a classe "Item" dentro da classe "Compra" do seguinte modo:
		 *iniciamos esse método passando "item" do tipo "Item" como 
		 *parametro através do comando "void additem(Item item)" logo
		 *após isso adicionamos "item" à nossa lista através do comando
		 *"itens.add(item);", depois de adicionarmos "item" a lista passamos
		 *a "item" o valor da classe atual que é a classe "Compra" através do
		 *comando "item.compra = this;"	, ou seja a classe "Item" recebeu o 
		 *valor de "Compra" e a classe "Compra" recebeu o valor de "Item". */
		void additem(Item item) {
			itens.add(item);
			item.compra = this;	
		}
		
		/*Esse método não irá receber o "item" mais sim os seus atributos,
		 *desse modo não precisamos instanciar o objeto dentro da classe main
		 *sempre que formos adicionar um item, instanciamos ele aqui para na hora
		 *de adicionar alguma item basta chamar o método "additem".	*/
		void additem(String nome, int quantidade, double preço) {
			this.additem(new Item(nome,quantidade,preço));
		}
		
	
		
		
		double valortotal() {
		double total = 0;
		for(Item item : itens) {
			total += item.preço * item.quantidade;
		}
		return total;	
		}
	

}
