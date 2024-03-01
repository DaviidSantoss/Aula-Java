package Controles;

import java.util.Scanner;

public class Desafio02_Dias {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o dia da Semana: ");
		String c1 = teclado.next();
		
		/*Si variável c1 corresponder aos dias digitados
		 * pelo usuário então tais ações abaixo serão executadas.*/
		if(c1.equals("Domingo")) {
			System.out.print("1");
		}else if(c1.equalsIgnoreCase("Segunda")) {
			System.out.print("2");
		}else if(c1.equalsIgnoreCase("Terça")) {
			System.out.print("3");
		}else if(c1.equalsIgnoreCase("Quarta")) {
			System.out.print("4");
		}else if(c1.equalsIgnoreCase("Quinta")) {
			System.out.print("5");
		}else if(c1.equalsIgnoreCase("Sexta")) {
			System.out.print("6");
		}else if(c1.equalsIgnoreCase("Sabado")) {
			System.out.print("7");
		}else {
			System.out.print("Dia inválido!");
		}
		
		
		
		
		teclado.close();
	}
}
