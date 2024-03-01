package ObjetoCarro_UmPraUM;

public class Aula02_Motor {
	//instanciamos o carro com o valor nulo,
	//e utilizando o "final"para que ele não 
	//possa ser alterado
	final Aula01_Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1;
	boolean porta = false;
	//na contrução do motor definimos uma carro
	//como parametro, ou seja, definimos que um
	//carro pertence a esse motor,sendo assi,ligamos
	//o carro ao motor e o motor ao carro.
	Aula02_Motor(Aula01_Carro carro) {
		this.carro = carro;
	}
	
	//Método que ira retornar o valor do giro
	int giros () {
		if(!ligado ) {
			return 0;
		} else {
				return (int) Math.round(fatorInjecao * 3000);
		}
	
	}	

}

//Fator de injeção começa valendo 3000