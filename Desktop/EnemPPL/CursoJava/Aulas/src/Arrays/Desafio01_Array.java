package Arrays;

import java.util.Scanner;

public class Desafio01_Array {

	
		public static void main(String[] args) {
			
		/* Começamos criando um Scanner denominado "c", após isso fizemos uma
		 * requisição aonde perguntamos "Quantas nota você quer informar?", logo
		 * em seguida armazenamos o número digitado pelo usuário dentro da variável 
		 * "n1" que virá a ser o tamanho do nosso "Array", após isso criamos o nosso
		 * "Array" utilizando o comando "double [] notas = new double [n1];" onde "n1"
		 * irá determinar o tamanho do array, em seguida fizemos um  "for int" aonde
		 * criamos um "Contador de notas" aonde é requisitado para o usuário digitar as 
		 * suas notas, que então serão armazenadas na variável "n2" , e logo após serem
		 * armazenas dentro de "n2" armazenamos as notas dentro do "Array" atráves do comando
		 * "notas[i] = n2;", em seguida criamos um variável "Double" com o nome de soma que
		 * será utilizada para armazenar as soma dos valores que estão dentro do "Array",após
		 * isso criamos um "for" aonde ele irá percorrer todo o "Array" e irá adicionar os 
		 * valores dentro da variável "soma", e para finalizar exibimos um "print"
		 * que nos mostras a variável "soma (com a soma das notas do usuário), divido pelo número de 
		 * notas que o usuário digitou" */	
			
			
			//requisição
			Scanner c = new Scanner(System.in);
			System.out.print("Quantas nota você quer informar? ");
			
			//tamanho do array
			int n1 = c.nextInt();
			
			//array e suas informações
			double [] notas = new double [n1];
			
			//for para requisição de notas
			for(int i = 0; i < n1 ; i++) {
				System.out.print("Digite a nota " +(i + 1)+": ");
				double n2 = c.nextDouble();
				notas[i] = n2;
				}
				
			double soma = 0;
			for(double nota : notas) {
				soma += nota;
			}
				
			System.out.println("A sua média é "+(soma / n1));
			
		c.close();
		
		
		}
}