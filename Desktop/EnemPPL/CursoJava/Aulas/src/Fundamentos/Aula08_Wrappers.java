package Fundamentos;

public class Aula08_Wrappers {

		public static void main(String[] args) {
			
			Byte b = 100;
			Short s = 1000;
			Integer i = 10000; //int
			Long l = 100000L;
			
			/*O comando ".byteValue ira exibir o valor dentro
			 *da variável "b"*/
			System.out.println(b.byteValue());
			/*O comando ".toString" ira converter a variável
			 *"s" que é do tipo "short" para "String".*/
			System.out.println(s.toString());
			//ira multiplicar o valor de "i" por 3
			System.out.println(i * 3);
			//ira dividir o valorde l por 3
			System.out.println(l / 3);
			
			/*Declaramos um variavel "bo" do tipo Boolean
			 *esse código ira analisar o que tem dentro das
			 *" " caso seja "true" ele retornará true porem caso
			 *seja qualquer coisa diferente de true ele retornará
			 *"false"*/
			Boolean bo = Boolean.parseBoolean("true");
			System.out.println(bo);
			
			/*Com o comando ".toString" transformamos a variável
			 *"bo" para string e após ela ser um string utilizamos
			 *o comando ".toUpperCase" para deixar as suas letras
			 *em maiusculo*/
			System.out.println(bo.toString().toUpperCase());
			
			//Ira concatenar "++" a variável "c"
			Character c = 'C';
			System.out.println(c+"++");
			
			float f = 404.04F;
			System.out.println(f);
			
			double d = 400289.22;
			System.out.println(d);
			
			
			
		}
}
