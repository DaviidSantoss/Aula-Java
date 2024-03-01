package Fundamentos;

public class Aula09_ConversTiposPrimitivos {
	
	public static void main(String[] args) {
		
		
		//conversão feita implicitamente pois
		// o valor 1 é do tipo int e foi atribuido
		//a uma variável do tipo double, e isso ocorreu
		//sem problemas pois o double é maior que o int
		//sendo assim não houve perca de informação
		double a = 1;	//implicita
		System.out.println(a);
		
		
		/*Esse tipo de conversão foi do tipo explicita
		 *pois especificamos ao java o tipo que deveria
		 *ser convertido no caso "float", e aqui houve perca
		 *de informação pois o "float" não suporta um valor 
		 *deste tamanho já o "double" sim.*/
		float b = (float) 1.40028922900; //explicita (CAST)
		System.out.println(b);
		
		/*Transformamos um "int" e um "byte" e tivemos que fazer isso
		 *de forma explicita pois o "int" é bem maior que o "byte", e 
		 *caso o valor do "int" estrapole o valor suportado pelo "byte"
		 *que é 126 o "byte" ira retornar o seu menor valor que é -127*/
		int c = 340;
		byte d = (byte) c; //explicita
		System.out.println(d);
		
		
	}

}
