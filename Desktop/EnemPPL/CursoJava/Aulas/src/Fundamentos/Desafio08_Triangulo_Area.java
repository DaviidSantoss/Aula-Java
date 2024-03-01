package Fundamentos;

import java.util.Scanner;

public class Desafio08_Triangulo_Area {
	
	public static void main(String[] args) {
		
		//Criar um programa que leia o valor da base 
		//e da altura de um triângulo e calcule a área.
		
		//b*h /2 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual valor da base do seu Triangulo ? ");
		double n1 = teclado.nextDouble();
		
		System.out.print("Qual valor da base do seu Triangulo ? ");
		double n2 = teclado.nextDouble();
		
		double conta = (n1 * n2) / 2;
		
		System.out.println("A área do seu triangulo é: "+conta);
		
		teclado.close();
		
		
		//System.out.println("A área do seu triangulo é: "+conta);

		
		
		
	}

}
