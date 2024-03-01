package Fundamentos;

import java.util.Scanner;

public class Aula18_StringEquals {
	
	public static void main(String[] args) {
		
		String s = new String ("2");
		//Equals compara se os dados de uma String é
		//igual os dados de outra String
		System.out.println("2".equals(s));
		
		Scanner teclado = new Scanner(System.in);
		String s2 = teclado.nextLine();
		
		System.out.println("2".equals(s2.trim()));
		
		
		
		teclado.close();
	}
}
