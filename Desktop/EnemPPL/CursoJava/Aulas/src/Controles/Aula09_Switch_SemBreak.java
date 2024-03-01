package Controles;

import java.util.Scanner;

public class Aula09_Switch_SemBreak {
	
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		System.out.print("Qual sua idade ? ");
		int idade = c.nextInt();
		
		switch(idade) {
		/*Sem o break ele executara tudo oq estiver abaixo daquele bloco
		  ou seja caso eu escolha a opção 5, ele ira executar os blocos 5,6,7*/
		case 3:
			System.out.println("Sabe falar e andar");
			break;
		case 4: 
			System.out.println("Saber perguntar");
			break;
		case 5:
			System.out.println("Sabe eleborar um pensamento");
			break;
		case 6:
			System.out.println("Sabe fazer um pergunta bem elaborada");
			break;
		case 7:
			System.out.println("Sabo tudo");
			break;
		
		}
		
		c.close();
	}

}
