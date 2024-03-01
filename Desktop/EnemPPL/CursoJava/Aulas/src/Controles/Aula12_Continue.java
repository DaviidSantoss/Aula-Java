package Controles;

public class Aula12_Continue {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			/*Si o resto da divisão de i por 2
			 *for igual a 1, ele vai interromper 
			 *aquela iteração e vai para a proxima
			 *ou seja ele apenas interrompe algumas
			 *interações*/
			if(i == 9) {
				continue;
				
			}
			System.out.println(i);
			
		}
		
	}
}
