package DesafioObjeto;

import java.util.ArrayList;



public class Cliente {
		//instancias
		Compra compra;
		String nome;
	
		//lista de compras
		ArrayList<Compra> compras = new ArrayList<Compra>();
	

		//adicionamos "Compra" a lista de compra e
		//adicionamos Cliente a compra.
		void addcompra(Compra compra) {
			compras.add(compra);
			compra.cliente = this;
		}
		
		//método para adicionar a  compra mais facil
		void addcompra(String nome, int quantidade,double preço) {
			this.addcompra((new Compra(nome,quantidade,preço)));
		}
		
	
			//método valor total
			double valortotal() {
			double total = 0;
			for(Compra compas : compras) {
				total += compas.item.quantidade * compas.produtos.preço;
			}
			return total;
		}
		
		
	
	}
	
	
