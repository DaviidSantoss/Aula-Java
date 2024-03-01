package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Aula04_Queue {
	
		public static void main(String[] args) {
			
			//Assim criamos uma "fila" o "LinkedList" atua uma
			//"fila" dentro do java.
			Queue<String> fila = new LinkedList<>();
			
			//essa forma de adicionar irá lançar uma exceção caso a 
			//fila esteja cheia
			fila.add("Renan");
			//Já essa outra forma retornara falso caso a fila esteja cheia.
			fila.offer("Geruza");
			
			//Serve para pegar o primeiro elemento da fila
			//porém caso a lista esteja vazia ele retorna "null"
			System.out.println(fila.peek());
			
			//Esse caso tambpem serve para pegar o primeiro elemento
			//da fila porém caso a lista esteja vazia ele retornará um 
			//erro
			System.out.println(fila.element());
			
			//"isEmpty();" é utilizado para verificar se a fila está
			//vazia, retornar "true" se ela estiver vazia e false se 
			//não estiver
			System.out.println(fila.isEmpty());
			
			//".poll();" ela primeiro mostra o "elemento" que está sendo
			//removido e logo em seguida o  remove, e caso a fila esteja vazia,
			//ela retorna false
			System.out.println(fila.poll());
			
			//é utilizado também para remoção de elementos, porém caso  a fila
			//esteja vazia ela retornará um erro
			System.out.println(fila.remove());
			
			
			
			
			
			
			
			for(String filinha : fila) {
				
				System.out.println("for Each:"+filinha);
			}
		}
}
