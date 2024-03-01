package Controles;

import java.util.Scanner;

public class Desafio10_Adivinhação {
	public static void main(String[] args) {
		
		
		/*Jogo da adivinhação: Tentar adivinhar um número entre 0 e 100. 
		 * Armazene um numero aleatório em uma variável. O Jogador tem 
		 * 10 tentativas para adivinhar o número gerado. Ao final de cada 
		 * tentativa, imprima a quantidade de tentativas restantes, e imprima 
		 * se o número inserido é maior ou menor do que o número armazenado.*/
		
		int tentativas = 2;
		int usunum = 0;
		
		//Numero random
		double random = Math.random();
		int aleatorio = (int) (0 + random * (5 - 0));
		
		Scanner c = new Scanner(System.in);
		/*Enquanto "usunum" for diferente de "aleatorio" e tentativas 
		 * for maior que 0, o codigo abaixo será executado*/
		while(usunum != aleatorio && tentativas > 0) {
		System.out.printf("Digite um número entre 0 e 100 [Tentativas: %d]: ",tentativas);
		usunum = c.nextInt();
		tentativas--;
		
		//Si tentativas for igual a 0 "VOCÊ PERDEU"
		}if(tentativas == 0) {
			System.out.println("VOCÊ PERDEU!");
			return;
		//Senão se "usunum" for igual a "aleatorio" você ganhou
		}else if(usunum == aleatorio) {
			System.out.println("Você acertou!");

		c.close();
		
		
		}	
	}
}
