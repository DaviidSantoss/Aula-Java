package Fundamentos;

import javax.swing.JOptionPane;

public class Aula11_StringParaNum {
	
	public static void main(String[] args) {
		
		/*Aqui requerimos ao usuário por meio de uma janela visual que
		 *ele digitasse dois valores sendo eles armazenados na variável
		 *n3 e n4, porém independente do valor que os usuários digitarem
		 *eles são "String", porque nós especificamos no inicio que seria deste
		 *tipo,após o usuário digitar os dois valores elas serão armazenadas
		 *na variável n3 e n4 que transformarão os valores de "Strings" para
		 *"Double", após serem transformadas em "Double" utilizamos os valores
		 *inseridos do usuários para realizar um soma dos valores e uma média.*/
		String n1 = JOptionPane.showInputDialog("Digite um Número: ");
		String n2 = JOptionPane.showInputDialog("Digite outro Número: ");
		
		double n3 = Double.parseDouble(n1);
		double n4 = Double.parseDouble(n2);
		
		double soma = n3 + n4;
		System.out.println("A soma é: "+soma);
		System.out.println("A Média é: "+soma / 2);
	}

}
