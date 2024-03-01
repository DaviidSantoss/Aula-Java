package Fundamentos;

public class Aula12_Aritiméticos {
	
	public static void main(String[] args) {
		
		System.out.println(2+3);
		
		var x  = 3.36;
		double y = 2.2;
		
		System.out.println(x + y );
		System.out.println(x - y );
		System.out.println(x * y );
		System.out.println(x / y );
		
		int z = 27;
		int n = 5;
		System.out.println(z + n);
		System.out.println(z - n);
		System.out.println(z * n);
		//para dar um número quebredo é 
		//só usar o typeCast
		System.out.println(z / (double)n);
		
		System.out.println(z % n);
		
	}

}
