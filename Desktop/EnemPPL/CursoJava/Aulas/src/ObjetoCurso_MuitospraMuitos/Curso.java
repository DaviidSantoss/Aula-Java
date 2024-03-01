package ObjetoCurso_MuitospraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	
	final String nome;
	final List<Aluno> alunos = new ArrayList<Aluno>();
		
	//Contrutor que define que precisa ser
	//inciado com uma String
	Curso(String nome){
		this.nome = nome;
	}
	
	
	
	//Aqui fizemos uma relação bidirecional
	//porque adicionamos a classe "aluno" à
	//classe "Curso"
	void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
		
	}

}
