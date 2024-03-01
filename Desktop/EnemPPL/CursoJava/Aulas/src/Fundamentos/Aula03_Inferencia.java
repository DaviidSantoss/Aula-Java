package Fundamentos;

public class Aula03_Inferencia {
		public static void main(String[] args) {
			
			/*Não declarei seu tipo mas o
			próprio java inferiu um tipo
			após perceber o tipo de dado
			que foi inserido*/
			var a = "David";
			System.out.println(a);
			
			/*Não posso atribuir uma valor
			 *do tipo int numa variável do
			 *tipo String, pois acima já foi
			 *inferido que seu tipo é String
			 *a = 8;*/
			
		}
		
}
