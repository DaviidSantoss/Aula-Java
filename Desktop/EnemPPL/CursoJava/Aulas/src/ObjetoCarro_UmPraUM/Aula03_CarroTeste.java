package ObjetoCarro_UmPraUM;

public class Aula03_CarroTeste {

	
	public static void main(String[] args) {
		
		/*Com esse comando adicionamos um novo objeto 
		 *"Carro" dentro da classe "CarroTeste, ou seja 
		 *relacionamos a classe "Carro" com a classe 
		 *"CarroTeste" e dentro da classe "Carro"
		 *possuimos objetos da classe "Motor" sendo
		 *assim também temo acesso a ela, como o 
		 *comando "System.out.println(bmw.motor.giros());"
		 *no mostra */
		Aula01_Carro bmw = new Aula01_Carro ();
		
		
		//verifica se o carro está ligado como
		//ele está desligado retornará "false
		System.out.println(bmw.estaligado());
		
		//Agora que chamamos o método ligar o 
		//carro está ligado sendo assim retornara
		//true
		bmw.ligar();
		System.out.println(bmw.estaligado());
		
		
		//chamamos o objeto "bmw" que chamou a casse
		//"motor" que por sua vez chamou o método "giros"
		System.out.println(bmw.motor.giros());
		
		//Chamando o método acelerar 4x ele ira aumentar
		//o giro do motor 
		bmw.acelerar();
		bmw.acelerar();

		
		
		
		System.out.println("GIROS AQUI:  "+bmw.motor.giros());
		
		//Após chamar o metodo frear ele ira reduzir o
		//giro do motor
		bmw.frear();
		bmw.frear();
		bmw.frear();
		bmw.frear();
	
		System.out.println(bmw.motor.giros());
		
		//Relação bidirecional
		System.out.println(bmw.motor.carro.motor.carro.motor.giros());
		
		
		//porta aberta o carro não acelera
		bmw.motor.porta = true;
		
		bmw.acelerar();
		bmw.acelerar();
		bmw.acelerar();
		
		System.out.println("O giro é "+bmw.motor.giros());
	}
	
	
	
}
