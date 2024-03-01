package DesafioObjeto;

public class ClienteTeste {

	
	public static void main(String[] args) {
	
		Cliente c1 = new Cliente();
		c1.nome = "David";
		 
		c1.addcompra("Abacaxi", 1, 10);
		c1.addcompra("Morango", 1, 25);
		c1.addcompra("Pessego", 5, 20);
		
		System.out.println("O nome do cliente é "+c1.nome);
		System.out.println("Um cliente gastou um total de "+c1.valortotal());
		
		
		
		
	}
}
