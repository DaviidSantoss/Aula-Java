package Classe;

public class Aula04_ValorVsRef {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a+" "+" "+b);
		int c = 5;
		primitivoPadrao(c);
		System.out.println(c );
		
		Aula02_Data d1 = new Aula02_Data(1,6,1991);
		Aula02_Data d2 = d1; //atribuição por referência(obejto)
		d1.dia = 2;
		d1.mes = 9;
		d2.ano = 1945;
		
		System.out.println(d1.dataFormatada());
		
		dataPadrao(d1);
		System.out.println(d1.dataFormatada());
	}

	
	static void dataPadrao(Aula02_Data d) {
		d.dia = 2;
		d.mes = 1;
		d.ano = 1991;
	}
	
	static void primitivoPadrao (int c) {
		c++;
		
	}
}
