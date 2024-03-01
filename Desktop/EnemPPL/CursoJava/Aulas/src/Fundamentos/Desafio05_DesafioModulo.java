package Fundamentos;

import java.util.Scanner;

public class Desafio05_DesafioModulo {

		public static void main(String[] args) {
			
			/*Desafio é ler um  dois números inseridos pelo o usuário
			 *e realizar a conta com base ná opção do usuário, ele podera
			 *escolher entre "+, -, *, /, %",Exemplo se o usuário digitar dois numeros
			 *c1 = 2 e c2 = 7, e escolher as opção "*" a conta a ser realizada sera de 
			 *multiplicação*/
			
			
			
			/* Em Java, o comando String.valueOf() converte diferentes tipos de dados 
			 * (como inteiros, ponto flutuante, caracteres, etc.) para o tipo de dado String. 
			 * Ele retorna uma representação em formato de string do valor fornecido como argumento.
			 * Exemplo "String.valueOf(c1+c2)" ele irá converter o resultado da expressão "c1+c2" em
			 * String.*/
			
			//objeto teclado que ira pegar as informações
			Scanner teclado = new Scanner(System.in);
			
			//requisição
			System.out.print("Digite um número: ");
			double c1 = teclado.nextDouble();
			
			//requisição
			System.out.print("Digite outro número: ");
			double c2 = teclado.nextDouble();
			
			//requisição
			System.out.print("Qual tipo de operação deseja fazer? '+, - , *, /, %'");
			String c3 = teclado.next();
			
		
			String conta = c3.equals("+") ? String.valueOf(c1+c2) : c3.equals("-") ? String.valueOf(c1-c2) : c3.equals("*") ? String.valueOf(c1*c2) : 
			c3.equals("/") ? String.valueOf(c1 / c2) : c3.equals("%") ? String.valueOf(c1 % c2) : "valor invalido";
			
			
			System.out.println("O resultado de: "+c1 +" "+ c3 +" " + c2 + " "+ "É = "+conta);
			
			teclado.close();
			
			/*Explicando o código: Será feito ao usuário duas requisições utilizando o 
			 * objeto Scanner para monitorar tudo que ele digitar e utilizando as variáveis
			 * "c1,c2", para armazenar os números que ele digitar, em seguida fazemos um terceira
			 * requisição aonde pedimos para o usuário inserir o tipo de conta que ele quer que se
			 * feito seja soma multplicação e etc, logo após isso  utilizamos uma String com o nome
			 * de "conta" para fazer algumas comparações e tomadas de decisões, um exemplo disso é o
			 * seguinte código, "c3.equals("+") ? String.valueOf(c1+c2)" esse código nos diz o seguinte,
			 * se dentro da variáve "c3" tiver um caractere igual a ".equals("+")" então será executada
			 * a ação de "String.valueOf(c1+c2)".E isso se repete para todos os tipos de operações e caso
			 * o usuário digitar um sinal diferente das opções apresentadas o codigo irá ser executada uma mensagem 
			 * "valor invalido"*/
			
			
			
			
			
			
			
			
			
		}
}
		

	
