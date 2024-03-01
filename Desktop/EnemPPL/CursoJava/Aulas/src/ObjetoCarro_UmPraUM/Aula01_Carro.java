package ObjetoCarro_UmPraUM;

public class Aula01_Carro {

	//instanciando o objeto Motor, como final
	//para que ele não possa ser alterado
	final Aula02_Motor motor;
	
	
	
	
	//Definimos que para a construção de um carro
	//o carro precisa de um motor, ou seja, ligamos
	//o carro ao motor e o motor ao carro
	 Aula01_Carro() {
		this.motor = new Aula02_Motor(this);
	}
	
	//Método acelerar
	//Fator de injeção começa valendo 1 
	//enquanto o fator de injeção for menor
	//que 2.6 poderá adiciar a ela "+0.4"
	 void acelerar () {
			if(motor.porta == true){
				motor.fatorInjecao = 1;
			}
			else if(motor.fatorInjecao < 2.6)
			motor.fatorInjecao += 0.4;
			}
		
	
	
	
	//Método frear
	void frear() {
		if(motor.fatorInjecao > 0.5) {
		motor.fatorInjecao -= 0.4;
		}	
	}
	
	
	//Método para ligar
	void ligar() {
		motor.ligado = true;
	}
	
	//Método para desligar o carro
	void desligar() {
		motor.ligado = false;
	}
	
	//Método ira retornar o estado do carro
	boolean estaligado () {
		return motor.ligado;
	}
	






}

