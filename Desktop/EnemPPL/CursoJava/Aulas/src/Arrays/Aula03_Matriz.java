package Arrays;

import java.util.Scanner;

public class Aula03_Matriz {
	
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		//requisição do número de alunos
		System.out.print("Quantos Alunos tem na turma? ");
		int alun = c.nextInt();
		
		//requisição das notas de cada aluno
		System.out.print("Quantas notas por aluno? ");
		int alunnotas = c.nextInt();
		
		//matriz 
		double [] [] notasDaTurma = new double [alun] [alunnotas];
		

		double soma = 0;
		
		//irá percorrer cada alunos
		for(int a = 0; a < notasDaTurma.length; a++) {
			//irá percorrer as notas de cada aluno
			for(int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do alunos %d: ",(n + 1), (a + 1));
				
				notasDaTurma[a][n] = c.nextDouble();
				soma += notasDaTurma [a] [n];
			}
			
			System.out.println("A média da turma é: " + (soma / (alun * alunnotas)));
			
		}
		
		c.close();
		
	}
}
