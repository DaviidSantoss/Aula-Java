package Fundamentos;

public class Aula17_Ternários {

	public static void main(String[] args) {
		
		
		double nota = 7;
		/* Si nota for maior ou igual a 7 "Aprovado" ou si nota for maior ou igual a 5 reprovado*/
		String resultadofinal = nota >= 7 ? "Aprovado" : nota >= 5 ?"Recuperação" : "Reprovado";
	
		
		System.out.println(resultadofinal);
	}

}
