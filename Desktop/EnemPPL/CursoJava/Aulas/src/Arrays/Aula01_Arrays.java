package Arrays;

import java.util.Arrays;

public class Aula01_Arrays {
	
	public static void main(String[] args) {
		
		double [] notas = new double [3];
		
		notas[0] = 6.6;
		notas[1] = 10;
		notas[2] = 6.7;

		/*As arrays não são exibidas diretamente precisamos
		 * primeiro transforma-las em string para depois exibir*/
		System.out.println(Arrays.toString(notas));
		
		double total = 0;
		for(int i = 0; i < notas.length; i++) {
			total += notas[i];
			
			System.out.println(total / notas.length);
			
			/*Iniciamos esse array com dados literais
			 *sem precisar criar o seu local e atribuir 
			 *um valor*/
			double [] notas2 = {5.5, 10,9.5, 9.9, 1};
			
			double total2 = 0;
			for (int j = 0; j < notas2.length; j++) {
				total2 += notas2[j];
			}
			
			System.out.println(total2 / notas2.length);
			
			
		}
		
	}

}
