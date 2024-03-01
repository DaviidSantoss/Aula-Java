package ObjetoCurso_MuitospraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<Curso>();

	Aluno(String nome){
		this.nome = nome;
	}
	
	/*Aqui criamos um método utilizando sempre que
	 * queros transformar um objeto em String*/
	public String toString() {
		
		return "Meu nome é "+this.nome;
	}
	
	
	
	//Essa é outra relacão bidirecional aonde 
	//adicionamos a classe "Curso" a classe "Aluno"
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);	
	}
	
	//Criamos este método que está associado a classe "Curso"
	Curso obterCursoporNome(String nome) {
		/*Esse for-each percorreu todo o objeto "Curso", e também
		 *percorre a lista de cursos através do comando "this.cursos" */
		for(Curso curso : this.cursos) {
			/*Aqui fizemos uma comparação que nos diz que,
			 * si o nome de "curso" for igual a nome dado
			 * como parametro então ele irá retornar o "nome"
			 * de todas as pessoas que estão nesse curso*/
			if(curso.nome.equalsIgnoreCase(nome));
			return curso;
		}
		
		return null;
	}




}
