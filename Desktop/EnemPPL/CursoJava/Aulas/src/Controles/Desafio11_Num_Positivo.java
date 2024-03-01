package Controles;

import java.util.Scanner;

public class Desafio11_Num_Positivo {
		public static void main(String[] args) {
			
			
			
			/*	Criar um programa que enquanto estiver recebendo números positivos,
			 *  imprime no console a soma dos números inseridos, caso receba um 
			 *  número negativo, encerre o programa. Tente utilizar a estrutura do while.

*/
			
			Scanner c = new Scanner(System.in);

			double total = 0;
			double n1 = 0;
			
			
			//Enquanto n1 for maior ou igual a 0 a 
			//ação abaixo sera executada
			while(n1 >= 0 ) {
				System.out.printf("Digite um número: [T= %.1f ] ",(total));
				n1 = c.nextDouble();
					
			//A Soma só sera feita se n1 for >= 0
					if(n1 >= 0) {
					total += n1;
			
			//Se n1 for menor que 0 exiba "total"		
			}else if (n1 < 0){
				System.out.println("Soma = "+total);
			}
	
			
			
			
			
			
			
			
			
			}
			
				

			
			c.close();
			
			
		}
}
