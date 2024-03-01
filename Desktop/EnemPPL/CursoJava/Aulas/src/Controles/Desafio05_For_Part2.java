package Controles;

public class Desafio05_For_Part2 {
	
	public static void main(String[] args) {
		
		String valor = "$";
		
		/*a String "i" começa valendo "$" se o tamanho/length for menor ou
		 * igual a 5 adicione +"$" a variável "valor"*/
		for(String i = "$"; i.length() <= 5; i += "$") {
			System.out.println(valor);
			valor += "$";
		}
		
		
	}

}
