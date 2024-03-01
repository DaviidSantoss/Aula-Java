package Treino1PRA1;

public class Carro {
	Motor motor;
	
	
	Carro(){
		this.motor = new Motor (this);
	}
	
	
	
	void acelerar() {
		if(motor.fatordeInjecao < 2.6) {
		//utilizando o comando "motor.fatordeInjecao"
		//utilizamos o método que está dentro da classe
		//"motor", isso acontece porque ao relacionar uma 
		//classe com a outro podemos usar os métodos
		//que uma classe tem
		motor.fatordeInjecao +=0.4;
		}
	}
	
	void frear () {
		if(motor.fatordeInjecao  > 0.5) {
		motor.fatordeInjecao -= 0.4;
		}
	}
	
	//quando chamarmos este método a variável "ligado"
	//passará a ser "true" logo o carro vai ligar
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado () {
		return motor.ligado;
	}
}
