package Fundamentos;

import java.util.Scanner;

public class Aula07_Scanner {
	
	public static void main(String[] args) {
		
		System.out.printf("O Resultado da mega sena é: %d %d %d %d",1, 2, 3, 4);
		
		System.out.println("\nBom dia");
		System.out.print("Boa tarde");
		
		
		System.out.print("Qual ano você nasceu? ");
		Scanner teclado = new Scanner(System.in);
		int idade = teclado.nextInt();
		int con = 2024 - idade;
		System.out.println("Sua Idade é: "+con);
		
	
		
		teclado.close();
	}

}
