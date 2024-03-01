package Fundamentos;

public class Desafio03_Aritiméticos {

	
	public static void main(String[] args) {
		
		
		int c1 = 6 * (3+2) ;
		int c2 = (int) Math.pow(c1, 2);
		int c3 = c2 / (3 * 2);  // resultado 150
		
		
		int c4 = (1 - 5) * (2 - 7) / 2;
		int c6 = (int) Math.pow(c4, 2); // resultado 100
			
		int cf = c3 - c6; // 150 - 100 
		
		int cf2 = (int) Math.pow(cf, 3); // 50 elevado a 3
		int e1 = (int) Math.pow(10, 3); // 10 elevado a 3
		
		
		
		System.out.println(cf2 / e1); // 50 elavado a 3 DIVIDIDO por 10 elevado a 3
		
					
	}
}
