package Controles;

import javax.swing.JOptionPane;

public class Aula02_IF_Else {

	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um número");
		
		int num = Integer.parseInt(valor);
		
		if(num % 2 == 0) {
			System.out.println("O número "+num+" É par");
		}else {
			System.out.println("O número "+num+" É impar");
		}
		
		
		
	}
}
