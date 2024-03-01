package Classe;

public class Aula02_TesteData {
	
	public static void main(String[] args) {
		
		/*Aqui utilizamos a classe datas para poder criar
		 * novos objetos*/
		
		
		Aula02_Data datas = new Aula02_Data(2,9,2004);
		System.out.println(datas.dia+"/"+datas.mes+"/"+datas.ano);
		
	
		
		
		
		Aula02_Data d1 = new Aula02_Data(1,2,1945);
		
		
		System.out.println(d1.dataFormatada());
	}

}
