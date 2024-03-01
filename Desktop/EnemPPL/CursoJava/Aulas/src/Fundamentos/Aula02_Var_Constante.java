package Fundamentos;

public class Aula02_Var_Constante {
	
	public static void main(String[] args) {
		double raio = 5;
		//"final" transforma variavel
		//em constante
		final double PI = 3.14;
		
		//irei elevar o raio ao quadrado
		double raiz = Math.pow(raio,2 );
		double conta = (double) (PI * raiz);
		
		System.out.println("A área do circulo é = "+ conta);
		
		
	}

}
