package Controles;

public class Aula08_For2 {
	
	public static void main(String[] args) {
		/*Ele irá executar 10 vezes esse primeiro laço
		 * e logo após isso ele irá partir para o segundo
		 * laço executando assim mais 10 vezes o segundo laço.*/
		for(int c = 0; c <10; c ++) {
			for(int s = 0; s <10; s++) {
				System.out.printf("[%d, %d]",c,s);
			}
			System.out.println();
		}
	}

}
