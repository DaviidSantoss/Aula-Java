package Controles;

import java.util.Scanner;

public class Desafio06_numero_par {
	
	public static void main(String[] args) {
		
		/*Criar um programa que receba um número 
		 *e verifique se ele está entre 0 e 10 e é par;*/
	
			Scanner c = new Scanner(System.in);

			//requisição
			System.out.print("Digite um número entre 0 e 10: ");
			int n1 = c.nextInt();
			
			//si n1 for maior que 10 ou menor que 0
			//ação abaixo será executada
			if(n1 > 10 || n1 < 0) {
				System.out.println("Número invalido");
				//senão o resto da divisão de n1 por 2 for igual a 0
				//ação abaixo sera executada
			}else if(n1 % 2 ==0){
				System.out.printf("Seu número %d é Par",n1);
			}else {
				System.out.printf("Seu número é Impar!",n1);
			}
			
			
		
		
		
		c.close();
	
		
		
		
		
		
	}	
	}
	
	
	
	

