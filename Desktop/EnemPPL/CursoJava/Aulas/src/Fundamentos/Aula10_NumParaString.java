package Fundamentos;

public class Aula10_NumParaString {
	
	public static void main(String[] args) {
		
		//modo Wrapper
		Integer a = 70000;
		/*Primeiro convertemos a variável "a" que é do
		 *tipo "int" para "String", depois que ela se tornou
		 *uma "Sting" utilizamos um recurso somente destinado
		 *a "Strings" que é o ".length" que nos mostras quantos
		 *caracteres tem dentro da variável "a", essa é uma das
		 *vantagens de se transformar numeros em strings.*/
		System.out.println(a.toString().length());
		
		
		//modo primitivo
		int b = 700000;
		//Causa o mesmo efeito do de cima porem feito de uma
		//forma primitiva
		System.out.println(Integer.toString(b).length());
		
		//modo alternativo
		System.out.println((""+b).length());
		
		
	}

}
