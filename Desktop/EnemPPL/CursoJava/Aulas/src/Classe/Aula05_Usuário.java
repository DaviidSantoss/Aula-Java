package Classe;

public class Aula05_Usuário {
	
	String nome;
	String email;
	
	@Override
	//Aqui temos um Object com o nome de "comparar"
	public boolean equals(Object comparar) {
		

			//este código verifica se a variável "comparar" é uma 
			//instância da classe Aula05_Usuário.
			if(comparar  instanceof Aula05_Usuário) {
			//Aqui convertemos o "comparar" do tipo "Obeject"
			//para o tipo "Aula05_Usuário" criando um novo 
			//objeto ("outro")para poder converte-lo
			Aula05_Usuário outro = (Aula05_Usuário) comparar;
				
			//Aqui utilizamos o metodo boolean para comparar se 
			//o objeto "nome" é igual ao objeto "nome", isso tabém
			//se aplica ao email
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			
			return nomeIgual && emailIgual;
			
			}else {
				
				return false;
			}
		
		
		
		
		
	}
}
