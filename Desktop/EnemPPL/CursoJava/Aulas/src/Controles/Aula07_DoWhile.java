package Controles;

import java.util.Scanner;

public class Aula07_DoWhile {
	
	
		public static void main(String[] args) {
			
			Scanner c = new Scanner(System.in);
			String a = " ";
			
			do {
				System.out.print("Você precisa falar as palavras mágicas: ");
				a = c.nextLine();
			}while(!a.equalsIgnoreCase("Valeu"));
			
			System.out.println("Obrigado!");
			
		c.close();	
		}
		
		
}
