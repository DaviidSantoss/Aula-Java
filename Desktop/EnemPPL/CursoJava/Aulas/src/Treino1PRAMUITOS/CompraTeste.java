package Treino1PRAMUITOS;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		
		c1.cliente = "João";
		
		c1.additem(new Item("batata",5,1.2));
		c1.additem(new Item("caqui",5,2.3));
		c1.itens.add(new Item("Coca-Cola",1,12.90));
		c1.additem("perfume", 1, 150);
		
		
		System.out.println(c1.itens.size());
		
		System.out.println(c1.valortotal());
	}
	
	
}
