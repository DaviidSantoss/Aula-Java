package Classe;

public class Aula03_AreaCirc {
	
	
	double raio;
	/*  Mesmo a variável "pi" sendo um valor estatico é 
	 *  possivel mudar o seu valor utilizando o comando
	 * "Aula03_AreaCirc.pi = 3.556;" porém para que isso 
	 *  não acontece basta utilizarmos o comando "final" 
	 *  que ja vimos anterirormente que transforma a variável
	 *  em uma constante,após adicionar o "final" precisamos
	 *  mudar o nome da variável para letras maiusculas para
	 *  que possa funcionar.*/
		final static double PI = 3.14;
	
	Aula03_AreaCirc(double raioInicial){
		//raio é variável
		raio = raioInicial;
		
	}
	
	double area() {
		//esse metodo irá retornar a conta abaixo
		//area da circ = pi vezes R ao quadrado
		return PI * Math.pow(raio, 2);
	}

}
