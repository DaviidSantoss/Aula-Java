package Fundamentos;

import java.util.Scanner;

public class Desafio07_Quadrado_Cubo {
	
	public static void main(String[] args) {
		 
		//Criar um programa que leia um valor e apresente 
		//os resultados ao quadrado e ao cubo do valor.
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		int n1 = teclado.nextInt();
		
		int c1 = (int)  Math.pow(n1, 2);
		int c2 = (int) Math.pow(n1, 3);
		
		
		System.out.print(n1+" Elevado ao quadrado é: "+c1+" \n"+n1+" Elevado ao cubo é: "+c2);
		
		teclado.close();
		
		
	}

}
