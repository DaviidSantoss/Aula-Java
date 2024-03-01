package Classe;

public class Aula02_Data {
	
	
	/*Aqui criamos uma classe definindo o "dia" como um "Double"
	 * o "mes" também como um "double" e o "desconto" como um "double",para
	 * então podermos usar os obejtos dessa classe em outros projetos.*/
	int dia;
	int mes; 
	int ano;
		
	
		Aula02_Data(){
			//dia = 1;
			//mes = 1;
			//ano = 1970;
			this(1,1,1970);
		
	}
	
	
		Aula02_Data(int dia, int mes, int ano){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		

		
	
	
	//JEITO DO PROFESSOR
	
	String dataFormatada() {
		
		return String.format("%d/%d/%d",dia, mes, ano);
	}
	
	
}
	
	
		/*MEU JEITO
	
	
		String dataFormatada () {
		return "%.0f/%.0f/%.0f";
		
	}
	
}
    */