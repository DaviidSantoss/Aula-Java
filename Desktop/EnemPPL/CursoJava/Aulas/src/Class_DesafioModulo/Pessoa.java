package Class_DesafioModulo;

public class Pessoa {
	//peso
	//nome
	
	String nome;
	double peso;

	
	
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	
	
	}
	
	void comer(Comida comida) {
		this.peso += comida.peso;
		
	}
	
	
	
	
	
	
	
		
	}


