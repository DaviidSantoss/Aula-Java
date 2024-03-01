package Fundamentos;

public class Aula16_Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		//Pós incremento
		//a++;// a = a +1;
		//a--;// a = a -1;
		
		//Pré incremento
		//++b;// b = b+1;
		//--b;// b = b-1;
	
		//System.out.println(a);
		//System.out.println(b);
		
		//Como o "++" está na frente do "a" o incremento
		//será feito primeiro que a comparação por isso
		//o resultado é "true"
		System.out.println(++a == b--);//true
		System.out.println(a);//2
		//o resultado é 1 porque depois do incremento do "a"
		// e dopois da comparação entre as duas variáveis foi
		//feito o decremento da variável "b"
		System.out.println(b);//1
		
	}

}
