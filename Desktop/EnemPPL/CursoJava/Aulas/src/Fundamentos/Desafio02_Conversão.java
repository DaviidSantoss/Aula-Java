package Fundamentos;

import java.util.Scanner;
//import java.util.Locale;

public class Desafio02_Conversão {
	
	public static void main(String[] args) {
		
		
		/* O comando ".replace("","")" susbistitui um caracter que o usuario digitar 
		 * por outro, aonde primeiro vc define qual caracter vc quer que seja substituido
		 * pelo caracter que fara a substituição, Exemplo "String n1 = s1.nextLine().replace(",", ".");"
		 * . Vale a pena ressaltar o fato de que eu  preciso de apenas um Scanner
		 * para capturar os dados, então no código eu posso armazenar os dados de um unico 
		 * scanner em varias variáveis */
		
		
		//requisição
		System.out.print("Digite seu Salário do mês retrasado: ");
		//pega a informação
		Scanner s1 = new Scanner(System.in);
		//armazena a informação
		String n1 = s1.nextLine().replace(",", ".");
		
		//requisição
		System.out.print("Digite seu Salário do mês passado: ");
		//armazena informação
		String n2 = s1.nextLine().replace(",", ".");
		
		//requisição
		System.out.print("Digite seu Salário deste mês: ");
		//armazena informação
		String n3 = s1.nextLine().replace(",", ".");
		
		//converte string para double
		Double c1 = Double.parseDouble(n1);
		Double c2 = Double.parseDouble(n2);
		Double c3 = Double.parseDouble(n3);
		
		//conta
		Double conta = (c1+c2+c3) / 3;
		
		System.out.println("Sua média salarial é : "+conta);

		//
		s1.close();
	}

}
