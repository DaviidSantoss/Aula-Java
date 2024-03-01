package Controles;

import java.util.Scanner;

public class Aula01_IF {
	
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = c.nextDouble();
		
		if(media>=7) {
			System.out.println("Aprovado!");
		}else{
			System.out.println("Reprovado");
		}
		
		
		
		c.close();
		
	}

}
