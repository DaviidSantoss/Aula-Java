package Controles;

public class Aula13_Break_Rotulado {
		
	public static void main(String[] args) {
		
		/*O "externo" na frente do "for" serve como uma
		 *"nomeação", então quando utilizamos o "break externo;"
		 * paramos apenas o laço de repetição "externo"*/
		externo: for(int i = 0; i <= 5; i++) {
			for (int j = 0; j <=5; j++) {
				
				if(i == 2 && j == 1) {
					break externo;
				}
				
				System.out.printf("[%d , %d]",i,j);
				System.out.println();
			}
			
		}
		System.out.println("fim");
	}
}
