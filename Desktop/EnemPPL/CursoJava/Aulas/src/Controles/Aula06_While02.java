package Controles;

import java.util.Scanner;

public class Aula06_While02 {
	
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		//String vazia
		String l1 = "";
		
		/*Codigo explicado: o codigo nos diz o seguinte
		 *enquato "l1" for diferente de "sair" ele continuara
		 *executando o print "Você diz: " até que o usuário digite 
		 *sair*/
		while(!l1.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			l1 = c.nextLine();
			
		}
		
		
		
	
		
		
	c.close();
	
	
	

		
		
}
}