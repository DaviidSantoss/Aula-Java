package Fundamentos;

public class Desafio04_Lógicos {

	
	public static void main(String[] args) {
		
		
		//COPIAR AMANHA 
		
		//1 trabalho certo televisão de 32 polegadas
		//2 trabalhos certos televisão de 50 polegadas 
		//tanto comprando a televisão de 32 ou 50 tomar sorverte
		
		boolean t1 = false;
		boolean t2 = false;
		
		/* Explicando em ordem: Se os dois trabalhos estiverem certos "Vamos comprar uma 
		 * TV de 50POL e depois  tomar um sorvete", se apenas 1 trabalho estiver certo
		 * "Vamos comprar uma TV de 32 POL", se nenhum trabalho estiver certo vamos ficar
		 * em casa*/
		
		//Si t1 e t2 for true execute o print abaixo.
		if(t1 == true && t2 == true ) {
			System.out.println("Vamos comprar uma TV de 50POL e depois tomar um sorvete");
		//Si t1 for false e t2 for true, ou se t1 for true e t2 for false execute a opção abaixo
		}else if(t1 == false && t2 == true || t1 == true && t2 == false) {
			System.out.println("Vamos comprar uma TV de 32 POL");
		//caso nenhuma das três opçôes acima forem atendidas então essa ação sera executada.
		}else {
			System.out.println("Deu merda vamos ficar em casa!");
		}
		
		
	}
}
