package Treino1PRA1;

public class Motor {
	Carro carro;
	boolean ligado = false;
	double fatordeInjecao = 1;
		
		/*Essa é uma relação bidirecional, na contrução da classe 
		 *"Motor" eu passei que ela precisa receber um carro como 
		 *parametro para começar a ser construida.*/
		Motor(Carro carro){
			this.carro = carro;
		}
	
		int giros() {
		if(!ligado) {
			return 0 ;
		}else {
		return (int) Math.round(fatordeInjecao * 3000) ;
		}
	
	}
}
