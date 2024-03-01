package Fundamentos;

public class Aula04_TiposPrimitivos {
		
	public static void main(String[] args) {
		
		//informações do funcionário
		
		//Tipos númericos interios
		byte anosdeEmpresa = 23;
		short numViagens = 502;
		int id = 40028922;
		long pontosAcumulados = 3800920L;
		
		//Tipos númericos reais
		float salário = 30500.55F;
		double vendaAcumuladas = 2991797.01;
		
		//Tipos booleano
		boolean casado = false;
		
		//Tipo caractere
		char status = 'S';
		
		//Dias de trabalho
		System.out.println(anosdeEmpresa * 365);
		
		//Números de voos
		System.out.println(numViagens / 2);
		
		//Pontos por Real
		System.out.println(pontosAcumulados / vendaAcumuladas);
		
		//Relação de salário por ID
		System.out.println(id + " Ganha --> "+ salário );
		
		//Relação do status civil com ID
		System.out.println(id+"É casado? "+casado);
		
		//usuário está contratado ?
		System.out.println(status);
	}
}
