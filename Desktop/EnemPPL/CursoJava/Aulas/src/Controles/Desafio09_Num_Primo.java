package Controles;

import java.util.Scanner;

public class Desafio09_Num_Primo {
	
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int num = 0;
		
		//Criar um programa que receba um número e diga se ele é um número primo.
		
		System.out.print("Digite um número: ");
		num = c.nextInt();
		
		if(num  % 2 != 0 || num / 2 == 1) {
			System.out.printf("O número %d É Primo!",num);
		}else {
			System.out.printf("O número %d NÃO é Primo",num);
		}
		
		c.close();
	}

}
