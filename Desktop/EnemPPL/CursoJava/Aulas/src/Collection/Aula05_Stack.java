package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Aula05_Stack {

	
	public static void main(String[] args) {
		
		//"Deque" é a forma de se criar uma "pilha", que sera
		//do modo fila(firt in, last out).
		Deque<String> livros = new ArrayDeque <>();
		
		livros.add("Turma da monica");
		//nova forma de adicionar onde o conceito de pilha é implementado,
		//através do ".push" o elemento a entrar é o ultimo a sair.
		livros.push("O ego é seu inimigo");
		livros.push("O hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//um outro método utilizado para se excluir algum elemento,
		//pois se alista estiver vazia ele retornará um erro
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
	
	}
}
