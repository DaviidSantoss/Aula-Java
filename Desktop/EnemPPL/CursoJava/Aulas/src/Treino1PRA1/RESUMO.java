package Treino1PRA1;

public class RESUMO {
	
	/*		RELAÇÃO 1 PRA 1 (BIDIRECIONAL)
	 * 
	 * Para ter uma relação de 1 pra 1 eu não preciso
	 *necessariamente adicionar uma classe dentro de outra
	 *eu posso apenas instanciar a classe que eu preciso instanciar
	 *EXEMPLO:
	 *	

	public class Motor {

	boolean ligado = false;
	double fatordeInjecao = 1;
	
	
	
		int giros() {
		if(!ligado) {
			return 0 ;
		}else {
		return (int) Math.round(fatordeInjecao * 3000) ;
		}
		
		ESSA CLASSE MOTOR NÃO ESTÁ SE LIGANDO A NADA MAS A CLASSE
		ABAIXO "Carro" ESTÁ LIGADO A ELA.


		public class Carro {
	
	//instanciamos um motor da forma mais simples
	Motor motor = new Motor();
	
	void acelerar() {
		motor.fatordeInjecao +=0.4;
	}
	
	void frear () {
		motor.fatordeInjecao -= 0.4;
		
		
		JEITO DE FAZER SÓ QUE DE MODO BIDIRECIONAL
		
		Essa é uma relação bidirecional, na contrução da classe 
		"Motor" eu passei que ela precisa receber um carro como 
		parametro para começar a ser construida.
		
		public class Motor{
		
		Carro carro;
		
		Motor(Carro carro){
			this.carro = carro;
		}
	
	
		Na construção da classe "Carro" eu precisava passar para a 
		classe "Motor" uma carro como parametro, então eu utilizei o 
		comando "this.motor = new Motor (this);", que nos diz o seguinte:
		"esse motor receberá  o parametro Carro(this / que representa a classea atual)
		 na hora de ser construido"
		 
		public class Carro {
		Motor motor;
	
	
		Carro(){
		this.motor = new Motor (this);
		}
	
	 	
	 	OU SEJA DESSE JEITO UM CARRO APONTA PARA O MOTOR E O MOTOR APONTA PARA O CARRO
**/

}
