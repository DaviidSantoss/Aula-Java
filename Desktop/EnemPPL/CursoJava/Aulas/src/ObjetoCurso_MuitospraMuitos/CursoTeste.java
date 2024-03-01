package ObjetoCurso_MuitospraMuitos;

public class CursoTeste {

	public static void main(String[] args) {
		
		
		/* Ao que se refere aos códigos abaixo, podemos adicionar
		 * um aluno a um curso através do comando "curso1.adicionarAluno(aluno1);"
		 * isso acontece porque relacionamos à classe "Curso" a classe "Aluno",
		 * isso também acontece com o curso, podemos adicionar um curso à um
		 * aluno através do comando "aluno1.adicionarCurso(curso3);", tudo isso
		 * ocorre porque a classe "Curso" esta ligado a "Aluno" e a classe "Aluno"
		 * está ligada a "Curso"*/	
		
		
		//Criamos novos alunos atráves da classe 
		//Aluno
		Aluno aluno1 = new Aluno ("João");
		Aluno aluno2 = new Aluno ("Maria");
		Aluno aluno3 = new Aluno ("Pedro");
		
		//Criamos cursos através da classe curso
		Curso curso1 = new Curso("Eng.Soft");
		Curso curso2 = new Curso("Eng.Comp");
		Curso curso3 = new Curso("Eng.Pesca");
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		/* Criamos um for-each do tipo "Aluno" com o nome "aluno" que 
		 * nos permite ter acesso ao nome e ao curso de todos os alunos, 
		 * e também temos a possibilidade de  percorrer todo o Objeto 
		 * "curso3.nome" nos dando assim a possibilidade de acessar o 
		 * nome dos alunos matriculados no "curso3"*/
		for(Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso "+curso3.nome);
			System.out.println("e meu nome é "+aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		//Aqui criamos uma variável que contém o método "obterCursoporNome"
		//que compara se o nome do curso envia existe, e si exister e for
		//não nulo ele ira nos retornar o nome do curso e o nome dos alunos
		Curso cursoEncontrado = aluno1.obterCursoporNome("Eng.Soft");
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
		
		
		
	}
}
