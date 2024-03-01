package Controles;

import java.util.Scanner;

public class Aula10_Switch_Break {
	
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		System.out.print("Informe sua nota? ");
		int nota =  c.nextInt();
		String conceito = "";
		
		switch(nota) {
		case 10:
			conceito += "Nerd fpd!";
			break;
		case 9:
			conceito += "Toma cuido pra não virar nerd!";
			break;
		case 8: case 7:
			conceito += "Genio, sabe ser inteligente e passar batido";
			break;
		}System.out.print("Seu Conceito é  "+conceito);
	
	
	c.close();
	
	
	}
}
