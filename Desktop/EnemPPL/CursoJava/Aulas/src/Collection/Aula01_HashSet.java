package Collection;

import java.util.HashSet;
import java.util.Set;

public class Aula01_HashSet {

	
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static void main(String[] args) {
			
			//Set no modo não indexado ou seja todo bagunçado
			HashSet conjunto = new HashSet ();
			
			//com o ".add" adicionamos elementos ao
			//HashSet
			conjunto.add(3.3);
			conjunto.add(true);
			conjunto.add("Teste");
			conjunto.add(1);
			conjunto.add('X');
			
			//para exibir a quantidade de elementos
			// basta utilizar o ".size()"
			System.out.println(conjunto.size()); 
			
			//o set não aceita repetições porem essa
			//palavra "teste" é com letra minuscola já
			//a de cima é maiuscula,logo são palavras 
			//diferentes
			conjunto.add("Teste");
			System.out.println(conjunto.size()); 
			
			//ira dar false pois não existe "teste" com letra
			//minuscola
			System.out.println(conjunto.remove("teste"));
			//ira dar verdadeiro pois existe essa palavra
			System.out.println(conjunto.remove("Teste"));
			System.out.println(conjunto.remove('X'));
			
			System.out.println("O tamanho é "+conjunto.size());
			
			
			
			//ira retornar false pois o a letra x ja foi removida
			System.out.println(conjunto.contains('X'));
			//ira retornar true pois existe o valor 1 
			System.out.println(conjunto.contains(1));
			//ira retornar true porque existe o valor "true"
			System.out.println(conjunto.contains(true));
			//"contais" serve para verificar se contém ao determinado
			//valor dentro do HashSet
			
			Set nums = new HashSet ();
			
			nums.add(1);
			nums.add(2);
			nums.add(3);
			
			System.out.println(nums);
			System.out.println(conjunto);
			
			//Aqui fizemos a união de  num com o 
			//conjunto, pegamos todos os valores de nums
			//e adicionamos a conjunto, porém a ordem não
			//sera respeitada
			//conjunto.addAll(nums);
			
			//Aqui retemos apenas os dados em comum  entre
			//os dois, nesse caso foi o "1"
			conjunto.retainAll(nums);
			System.out.println(conjunto);
			
			
			conjunto.clear();
			System.out.println(conjunto);
			
			
			
			
			
			
			
			
		}
	
}
