package ObjetoCompra_UmPraMuitos;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		
		/*Aqui relacionamos o objeto "Compra" com 
		 *a classe "CompraTeste" o chamando de "compra1", 
		 *sendo assim podemos utilizar o "ArrayList" que etá 
		 *dentro de "Compra"*/
		Compra compra1 = new Compra ();
		
		compra1.cliente = "João";
		//Aqui utilizamos as funcionalidade do "ArrayList"
		//graças a relação da classe "Compra" com a "CompraTeste"
		compra1.itens.add(new Item("Carne", 2, 59.90));
		
		//Após relacionarmos o objeto  "Item" a classe "Compra" conseguimos
		//utilizar as funcionalidade do objeto "Item" sem precisar adicionar
		//itens utilizando o "ArrayList", e a funcionalidade responsável por 
		//isso é o "método" adicionarItem da classe "Compra"
		compra1.adicionarItem("Suco", 3, 3);
		
		compra1.itens.add(new Item("Arroz", 2, 63));
		compra1.itens.add(new Item("Laranja", 10, 14.33));
		compra1.adicionarItem("Abacaxi",1,13);
		compra1.adicionarItem("Lixia",1,13);
		System.out.println(compra1.itens.size());
		
		System.out.println(compra1.valortotal());
		
		//somente para mostrar a relação biredirecional, nós navegamos dentro de 
		//"Compras" através do objeto criado "compra1", e como a classe "Compra" 
		//possui o objeto "Item" e  possuiu uma "ArrayList" podemos utilizar as funcionalidades
		//que ele oferece
		//double total = compra1.itens.get(0).compra.itens.get(3).compra.valortotal();
		//System.out.println(total);
	}

}
