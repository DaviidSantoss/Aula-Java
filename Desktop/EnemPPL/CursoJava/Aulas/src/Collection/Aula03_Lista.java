package Collection;

import java.util.ArrayList;
import java.util.List;

public class Aula03_Lista {
	
	public static void main(String[] args) {
		
		/*Criamos uma lista utilizando o "List<Usuario>",
		 *o que está dentro de <> é o tipo da lista, nesse caso
		 *o nosso tipo vai ser "Usuário" que é um objeto que criamos*/
		List<Usuario> lista = new ArrayList<Usuario>();	
		
		
		//Essa é a forma de adicionar elementos em uma lista através
		//do usuário
		Usuario u1 = new Usuario("Maaa caveiraaaa");
		lista.add(u1);
		
		//era é outro forma de adicionar um elemento em uma lista
		//só que através do objeto "Usuario".
		lista.add(new Usuario("David"));
		lista.add(new Usuario ("Carlos"));
		lista.add(new Usuario ("Lia"));
		lista.add(new Usuario ("Bia"));
		lista.add(new Usuario ("Manu"));
		
		//"lista.get" serve para pegarmos o elemento 3 
		//que é nosso index
		System.out.println(lista.get(3));
		
		//Essa é uma forma de remover através do index
		lista.remove(0);
		//Essa é outra forma de remover só que através
		//do objeto "Usuario".
		lista.remove(new Usuario ("David"));	
		
		/*O comando "lista.contains(new Usuario("Lia"));" serve para
		 *verificarmos se "Lia" ainda pertence ao objeto "Usuario" se
		 *ela ainda pertencer a resposta sera true caso contrario false.*/
		System.out.println("Tem? "+lista.contains(new Usuario("Lia")));
		
		//for each que ira percorrer todos os elemtnos de "lista" e ira
		//exibir em um print.
		for(Usuario nomes : lista) {
			System.out.println(nomes);
		}
	}
}
