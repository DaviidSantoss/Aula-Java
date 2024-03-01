package Fundamentos;

public class Aula06_TipoString {

		public static void main(String[] args) {
			
			String r = "Bom dia";
			//Concatena alga a string
			System.out.println(r.concat("!!!!!"));
			//causa o mesmo efeito que o concat
			System.out.println(r+"!!!!!");
			//verifica se "começa com" a palavra "bom"
			System.out.println(r.startsWith("Bom"));
			//deifa a string em letra minuscula
			System.out.println(r.toLowerCase());
			//verifica se "termina com" a palavra dia
			System.out.println(r.endsWith("dia"));
			//mostra a quantidade de caracter que a string possui
			System.out.println(r.length());
			//compara a frase "BoM dia" com a string e nos
			//retorna true ou false
			System.out.println(r.equals("BoM dia"));
			//compara a frase com a da String porém ignora
			//as diferenças de letra minuscula e maiuscula
			System.out.println(r.equalsIgnoreCase("BOM DIA"));
			
			
			System.out.println(r.charAt(4));
			
			var nome = "David";
			var sobrenome = "Santos";
			var idade = "19";
			var salario = "30000.00";
			
			System.out.printf("O senhor %s %s,Tem %s anos, E ganha %.8s reais!",nome,sobrenome,idade,salario);
		}
		
}
