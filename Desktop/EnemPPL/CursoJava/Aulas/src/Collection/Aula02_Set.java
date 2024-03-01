package Collection;

import java.util.HashSet;
import java.util.Set;

public class Aula02_Set {

	public static void main(String[] args) {
		
		//Set homogêneo e ordenado, homogêneo 
		//porque ele aceita apenas dados do tipo "String"
		Set <String>lista = new HashSet<>();
		
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Lucas");
		lista.add("Pedro");
		
		/*For each que irá percorrer todos os usuários
		 *e exibirá de forma ordenada, o critério de ordenação
		 *neste caso é por ordem de inserção*/
		for(String aprovados : lista) {
			System.out.println(aprovados);
		}
	
		Set <Integer>nums = new HashSet<>();
		
		nums.add(5);
		nums.add(3);
		nums.add(1);
		nums.add(2);
		nums.add(4);
		
		/*For each irá percorrer todos os usuário
		 * e irá exibilos de forma ordenada*/
		for(int dois : nums) {
			System.out.println(dois);
		}
	
	
	
	
	}
	
}
