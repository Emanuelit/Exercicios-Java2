package br.com.exercícios;

import java.util.Scanner;
public class Exercício4 {
	/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
			ímpar exiba o número elevado ao quadrado.
	*/
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner read = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número: ");
		numero = read.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Número é Par e o resultado da Raiz quadrada é:  " + Math.sqrt(numero));
		} else {
			System.out.println("Número é Ímpar e o resultado da Raiz quadrada é " + Math.pow(numero, 2));
		}
		
		
		read.close();
		leia.close();
}
}
