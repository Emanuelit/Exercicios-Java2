package br.com.exerc�cios;

import java.util.Scanner;
public class Exerc�cio4 {
	/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
			�mpar exiba o n�mero elevado ao quadrado.
	*/
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner read = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um n�mero: ");
		numero = read.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("N�mero � Par e o resultado da Raiz quadrada �:  " + Math.sqrt(numero));
		} else {
			System.out.println("N�mero � �mpar e o resultado da Raiz quadrada � " + Math.pow(numero, 2));
		}
		
		
		read.close();
		leia.close();
}
}
