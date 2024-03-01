package Fundamentos;

import java.util.Scanner;

public class Desafio01_Conta_Constante {
		
		public static void main(String[]args) {
		
		//MEU JEITO
			
		/*System.out.print("Digite sua Temperatua em fahrenheit: ");
		Scanner teclado = new Scanner(System.in);
		float F = teclado.nextFloat();
		float conta = (float) ((F - 32) / 1.8);
		
		System.out.println("O Resultado é : "+ conta);
		*/
			
			//JEITO DO PROFESSOR
			
			//constante da diferença
			final float dif = 32;
			//constante da divisão
			final float div = (float) 5/9;
			//requisição para o usuário
			System.out.print("Digite Sua Temperatura em Fahrenheit: ");
			//escaneamento do teclado
			Scanner teclado = new Scanner(System.in);
			//variável que armazena oque foi inserido pelo teclado
			float F = teclado.nextFloat();
			//váriável da conta 
			float conta = (F - dif) * div;
			//print do resultado
			System.out.printf("Sua Temperatura em Celsius é: %.1f",conta);
			
			teclado.close();
		}
		
}
