package TreinoMUITOSpraMuitos;

import java.util.ArrayList;

public class Curso {

	
	/*Desse modo criamos um relação de muitos pra muitos, ou seja
	 *um curso tem muitos alunos e um aluno pode ter muitos cursos*/
	final String nome;
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	
	Curso(String nome){
		this.nome = nome;
	}
	
	
	/*método para adicionarmos um aluno, dentro da
	  classe "Curso" adicionamos um método chamado
	  "addaluno" que recebe "aluno" do tipo "Aluno"
	  como parametro, depois disso adicionamos "aluno"
	  dentro da lista "alunos", após "alunos" ser adicionado
	  a lista passamos a ele o valor da classe atual através
	  do comando "aluno.cursos.add(this);" ou seja
	*/
		void addaluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
