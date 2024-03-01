package Classe;

//import java.util.Date;

public class Aula05_Equal {

	public static void main(String[] args) {
		
		Aula05_Usuário u1 = new Aula05_Usuário();
		
		u1.nome = "Pedro silva";
		u1.email = "Pedro silva@gmail.com";
		
		
		Aula05_Usuário u2 = new Aula05_Usuário();
		
		u2.nome = "Pedro silva";
		u2.email = "Pedro silva@gmail.com";
		
		
		//irá retornar falso porque ele está comparando
		//dois objetos com locais de memória difirentes
		//System.out.println(u1 == u2);
		
		
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		//System.out.println(u2.equals(new Date()));
	}
}
