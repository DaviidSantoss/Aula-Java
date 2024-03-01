package Treino1PRAMUITOS;



public class Resumo {
	
	/*ABAIXO SERÁ MOSTRADO COMO FOI FEITO A RELAÇÃO DE 1 PRA N
	
	
	public class Compra {
	String cliente;
	
	Com a criação desta lista criamos uma relação 1 pra N,
	ou seja, 1 compra tem varios itens, e um item pertence 
	a uma compra.
	
	ArrayList<Item> itens = new ArrayList<Item>();
 
 	VALE RESSALTAR QUE DENTRO DA CLASSE ITEM NÃO ADICIONAMOS
 	A CLASSE COMPRA, COMO O EXEMPLO ABAIXO MOSTRA.
 	
 		public class Item {
	
		String nome;
		int quantidade;
		double preço;
		
		ENTÃO POR CAUSA DA LISTA TEMOS VARIÓS ITENS DENTRO DE COMPRA
		E ISSO CARACTERIZA UMA RELAÇÃO 1 PRA N.
		
		
		MODO BIDIRECIONAL DE FAZER O PROCESSO DESCRITO ACIMA:
		
		
		public class Compra {
		
		ArrayList<Item> itens = new ArrayList<Item>();
		
		Criamos um método "additem" que nos ajuda a adicionar
		a classe "Item" dentro da classe "Compra" do seguinte modo:
		iniciamos esse método passando "item" do tipo "Item" como 
		parametro através do comando "void additem(Item item)" logo
		após isso adicionamos "item" à nossa lista através do comando
		"itens.add(item);", depois de adicionarmos "item" a lista passamos
		a "item" o valor da classe atual que é a classe "Compra" através do
		comando "item.compra = this;"	, ou seja a classe "Item" recebeu o 
		valor de "Compra" e a classe "Compra" recebeu o valor de "Item". 
		
			void additem(Item item) {
			itens.add(item);
			item.compra = this;	
			}
			
			
		  Esse método não irá receber o "item" mais sim os seus atributos,
		  desse modo não precisamos instanciar o objeto "Item" dentro da classe main
		  sempre que formos adicionar um item, instanciamos ele aqui para na hora
		  de adicionar alguma item basta chamar o método "additem", ou seja todas
		  as informações que o usuário digitar serão setadas dentro de "Item".	
		 
			void additem(String nome, int quantidade, double preço) {
			this.additem(new Item(nome,quantidade,preço));
			}
			
			
			COMO PODEMOS VER NO EXEMPLO ABAIXO NA CLASSE ITEM SÓ PRECISAMOS
			INSTÂNCIAR A CLASSE COMPRA DE UMA FORMA SIMPLES.
			
			public class Item {
			
			Compra compra;
 			}
 			
 			FAZENDO ISSO NA HORA DE ADICIONAR ALGUM ITEM DENTRO DA CLASSE MAIN
 			UTILIZANDO A LISTA EU NÃO PRECISO CRIAR UM NOVO OBJETO ITEM TODA VEZ,
 			POSSO APENAS UTILIZAR O MÉTODO "additem", PORQUE APARTIR DO MOMENTO QUE
 			EU ADICIONO ITEM DENTRO DA COMPRA EU ADICIONO COMPRA DENTRO DE ITEM.
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
