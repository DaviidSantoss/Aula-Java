package Controles;

import java.util.Scanner;

public class Desafio08_Media {
	public static void main(String[] args) {
		
		/*Criar um programa que receba duas notas parciais, calcular a média final. 
		 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
		 * se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
		 * caso contrário imprime no console "Reprovado".*/
		
			Scanner c = new Scanner(System.in);
			
			double nota1 = 0;
			double nota2 = 0;
			
			
			//REQUISIÇÃO
			System.out.print("Digite sua primeira nota: ");
			nota1 = c.nextDouble();
			
			/*Si a nota1 for menor ou igual a 0 e maior que 10 "nota invalida"*/	
			if(nota1 <=0 || nota1 > 10  ) {
			System.out.println("Nota invalida!");
			return; 
			
			/*Senão "Digite sua segunda nota"*/
			}else {
			System.out.print("Digite sua segunda nota: ");
			nota2 = c.nextDouble();
				
			/*Si a nota2 for menor ou igual a 0 e maior que 10 "Nota Invalida"*/	
			}if(nota2 <=0 || nota2 > 10 ) {
			System.out.println("Nota Invalida!");
			return;
			
			/*Senão, se ((nota1 + nota2) / 2 <= 7) "Recuperação"*/
			}else if((nota1 + nota2) / 2 <= 7){
			System.out.println("Aprovado!");
				
			/*Senão, se ((nota1 + nota2) / 2 <= 7) "Recuperação"*/
			}else if((nota1 + nota2) / 2 < 7 && (nota1 + nota2) / 2 >= 4) {
			System.out.println("Recuperação");
				
			/*Se nenhuma condição acima for atendida o aluno foi "Reprovado"*/
			}else {
			System.out.println("Reprovado");
			}
			
			c.close();
		
	}
}
