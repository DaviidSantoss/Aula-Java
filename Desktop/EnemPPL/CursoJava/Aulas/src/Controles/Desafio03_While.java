package Controles;

import java.util.Scanner;

public class Desafio03_While {
	
	public static void main(String[] args) {
		
		/* Calcular a média de uma turma
		 * 
		 * nota valida <=10 >0, si a nota for valida
		 * sera armazenada numa variável "total" e esse total
		 * irá armazenar a soma de todas as notas.
		 * 
		 * criar uma variavel aonde ela irá contar quantas notas
		 * validas foram armazenadas.
		 * 
		 * para fechar o programa o usuario deve digitar -1*/
		
		
	
		Scanner c = new Scanner(System.in);
		
		//variável nota
		double nota = 1;
		//Quantidade de notas validas
		double notavalida = 0;
		//variável nota somada com a anteriro
		double notatotal = 0;
		
		/*Enquanto nota for menor ou igual a 10 e maior que 0
		 *então sera requisitado "digite sua nota"*/
		while(nota <= 10 && nota > 0 ) {
			
			//requisição da nota mais armazenamento
			System.out.println("digite sua nota:");
			nota = c.nextDouble();
			
			//armazena as notas digitas dentro da variável "notatotal"
			notatotal += nota;
			
			//numero de notas validas
			notavalida++;		
			
		//fim do programa e calcula da média	
		}while(nota == 0){
		//double media = notatotal / ((notavalida -1));
		System.out.println((notatotal) / (notavalida -1));
			break;
		}
		
		c.close();
		

	}

}
