package Controles;

import java.util.Scanner;

public class Aula03_IF_ElseIF {
	
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		System.out.print("Qual foi sua nota? ");
		double n1 = c.nextDouble();
		
		if(n1 > 10 || n1 <0  ) {
			System.out.println("Nota Invalida!");
		}else if (n1 >= 8.1) {
			System.out.println("Seu conceito é A+");
		}else if (n1 >= 7 && n1 <8.1) {
			System.out.println("Seu conceito é B+");
		}else if(n1 >= 6 && n1 <7) {
			System.out.println("Seu conceito é C+");
		}else if(n1<6 ) {
			System.out.println("Seu conceito é C-");
		}
		
		
		
		
		
		c.close();
	}

}
