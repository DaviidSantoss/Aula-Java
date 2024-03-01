package Fundamentos;

import java.util.Scanner;

public class Desafio09_Bhaskara {
	
	public static void main(String[] args) {
		
		//Criar um programa que resolve equações do segundo grau 
		//(ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use 
		//como exemplo a = 1, b = 12 e c = -13. Encontre o delta
		
		//Variáveis
		
		//Obejto scanner que ira monitorar oq for digitado
		Scanner c = new Scanner(System.in);
		
		//requisição e armazenamento do valor de 'A'
		System.out.print("Digite o valor de 'A': ");
		double a = c.nextDouble();
		
		//requisição e armazenamento do valor de 'B'
		System.out.print("Digite o valor de 'B': ");
		double b = c.nextDouble();
		
		//requisição e armazenamento do valor de 'C'
		System.out.print("Digite o valor de 'C': ");
		double ce = c.nextDouble();
		
		//Delta
		
		//'B' ao quadrado
		double bqua = Math.pow(b, 2);
		
		double delta = bqua - ((4 * a) * ce);
		
		
		
		//Bhaskara
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("O valor de 'X1' é: " +x1);
		System.out.println("O valor de 'X2' é: " +x2);
		
		
		c.close();
		
		
		
	}

}
