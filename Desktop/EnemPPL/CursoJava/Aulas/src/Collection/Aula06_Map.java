package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Aula06_Map {

	public static void main(String[] args) {
		
		//esse é o metodo para se criar um "Map", entre os 
		// <> tem que se colocar o tipo de valores que serão,
		Map<Integer, String> usuarios = new HashMap<>();
		
		//".put" é jeito de se adicionar no "Map" sua diferença
		//é que ele adiciona caso uma das duas informações não exista
		// e substitui caso já exista 
		usuarios.put(1, "Yudi");
		usuarios.put(2, "ricardo");
		usuarios.put(3, "joão");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		//Era nos retornar apenas as chaves, porem ele 
		//não retorna de forma ordenada e sim na ordem
		//em que foi inserido
		System.out.println(usuarios.keySet());
		
		//".values" ira retornar apenas os valores
		System.out.println(usuarios.values());
		
		//já esse comando ".entrySet()" nos ira retornar
		//tanto as chaves quantos os valores.
		System.out.println(usuarios.entrySet());
		
		//o comando ".contaisKey()" serve para nos mostrar
		//se uma chave em especifico pertence ao objeto "usuario.
		System.out.println(usuarios.containsKey(3));
		
		//serve para nos mostra se um valor em especifico pertence ao
		//objeto "usuario"
		System.out.println(usuarios.containsValue("Rebeca"));
		
		//serve para pegarmos um elemento usando sua key
		System.out.println(usuarios.get(3));
		
		//com essa for-each percorremos apenas as chaves
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
	
		//já com esse for eche percorremos apenas os valores
		for(String valores : usuarios.values()) {
			System.out.println(valores);
		}
	
		//Esse for-each nos ira retornar os dois elementos tanto as keys quanto
		//os valores, para isso precisamos do "Entry" que é uma biblioteca java
		//por isso não podemos esquecer de importar ela.	
		for(Entry <Integer, String> registros : usuarios.entrySet()) {
			System.out.println(registros);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
