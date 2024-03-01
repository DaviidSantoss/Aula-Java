package TreinoMUITOSpraMuitos;

import java.util.ArrayList;

public class Aluno {

		final String nome;
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		
		//construtar para adicionar um aluno.
		Aluno(String nome){
			this.nome = nome;
		}
		
		/*primeiro adicionei "curso" do tipo "Curso" à lista
		 *"cursos" depois de adicionado, passei a "curso" o
		 *valor da classe atual que no caso é "Aluno", fazendo
		 *assim um relação bidirecional.*/
			void adicionarCurso(Curso curso) {
			this.cursos.add(curso);
			curso.alunos.add(this);
			
		}
			
			
		public String toString() {
			return nome;
		}
		
		
			Curso cursoPorNome(String nome) {
			
			for(Curso curso : this.cursos) {
				if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
				}
			
			}
			return null;
		
		}
}


