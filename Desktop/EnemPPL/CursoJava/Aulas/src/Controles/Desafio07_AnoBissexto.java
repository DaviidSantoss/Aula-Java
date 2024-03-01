package Controles;

import java.util.Scanner;

public class Desafio07_AnoBissexto {

		public static void main(String[] args) {
			
			
			//Criar um programa informa se o ano atual é um ano bissexto; 
			
			Scanner c = new Scanner(System.in);
			
			System.out.print("Digite seu ano Atual: ");
			double n1 = c.nextDouble();
			
			while(n1 % 4 == 0) {
				System.out.println("Seu ano é Bissexto!");
				break;
			}if(n1 % 4 != 0) {
				System.out.println("Seu ano NÃO é Bissexto");
			}
			
			
			
			
			
			c.close();
			
		}
}
