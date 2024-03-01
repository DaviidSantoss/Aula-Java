package Fundamentos;

import java.util.Scanner;

public class Desafio06_IMC {
	
	public static void main(String[] args) {
		
		//1-Criar um programa que leia o peso e a altura 
		//do usuário e imprima no console o IMC.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira seu peso: ");
		double n1 = teclado.nextDouble();
		
		System.out.print("Insira sua altura: ");
		double n2 = teclado.nextDouble();
		
		
		
		double conta = (n1 / Math.pow(n2, 2));
		
		String m = "Magreza";
		String n = "Normal";
		String sb = "SobrePeso";
		String ob = "Obesidade";
		String obg = "Obesidade Grave";
		
		
		if(conta<18.5) {
			System.out.printf("Seu IMC É: "+conta +" E sua classificação é: "+m);
		}else if (conta>18.5 && conta<24.9) {
			System.out.printf("Seu IMC É: "+conta+" E sua classificação é: "+n);
		}else if(conta>25 && conta<29.9) {
			System.out.printf("Seu IMC É  : "+conta+" E sua classificação é: "+sb);
		}else if(conta>30 && conta<39.9) {
			System.out.printf("Seu IMC É : "+conta+" E sua classificação é: "+ob);
		}else if(conta>40) {
			System.out.printf("Seu IMC É : "+conta+" E sua classificação é: "+obg);
		}
		
		teclado.close();


		
		
	}

}
