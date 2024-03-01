package Class_DesafioModulo;

import java.util.Scanner;

public class Jantar {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		//Pessoa 1
		Pessoa p1 = new Pessoa ("David",57.8);
		
		//Opções de comida
		Comida c1 = new Comida(0.4, "PF Básico");
		Comida c2 = new Comida(0.6, "PF Básico mais Batatas");
		Comida c3 = new Comida(0.9, "PF Básico mais Batatas mais Coca-Cola");

		
		
		//Requisição pessoa 1
		System.out.print("Olá "+p1.nome+" Qual será o prato da noite?\n"+c1.nome+" [1] \n"+c2.nome+" [2]\n"+c3.nome+" [3]  ");
		int pcomida = c.nextInt();
		
		if(pcomida == 1) {
			p1.comer(c1);
			System.out.printf("Seu peso atual é %.2f",p1.peso);
		}else if(pcomida == 2) {
			p1.comer(c2);
			System.out.printf("Seu peso atual é %.2f",p1.peso);
		}else {
			p1.comer(c3);
			System.out.printf("Seu peso atual é  %.2f",p1.peso);
		
		
		
		
		
		c.close();
	}
	
	
	
	}
}