package TreinoMUITOSpraMuitos;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Eng.soft");
		Curso curso2 = new Curso("Eng.Agro");
		Curso curso3 = new Curso("Eng.Comp");
		
		
		curso1.addaluno(aluno1);
		curso1.addaluno(aluno2);
		
		curso2.addaluno(aluno1);
		curso2.addaluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno : curso1.alunos) {
			System.out.println("Estou matriculado no curso 1 ");
			System.out.println("E me chamo "+aluno.nome);
			System.out.println();
		}
		
		
		System.out.println(aluno1.cursos.get(1).alunos);
		
		Curso cursoEncontrado = aluno1.cursoPorNome("eng.soft");
		
		//se "cursoEncontrado" for não nulo então sera executada a ação de baixo
		if(cursoEncontrado !=null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
		
	}

}
