package br.com.exerc�cios;

import java.util.Scanner;
public class Exerc�cio1 {
//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
	int numero1, numero2, numero3;
	
	System.out.println("Digite o primeiro n�mero: ");
	numero1 = leia.nextInt();
	
	System.out.println("Digite o segundo n�mero: ");
	numero2 = leia.nextInt();
			
	System.out.println("Digite o terceiro n�mero: ");
	numero3 = leia.nextInt();
	
	if(numero1 > numero2 && numero1 > numero3) {
		
		System.out.println("Esse � o maior n�mero dentre os tr�s" + numero1);
		}
	else if(numero2 > numero1 && numero2 >  numero3) {
		System.out.println("Esse � o maior n�mero dentre os tr�s" + numero2);
			}
	else if(numero3 > numero1 && numero3 > numero2) {
		System.out.println("Esse � o maior n�mero dentre os tr�s" + numero3);
	}
	else {
		System.out.println("n�mero inv�lido");
	}
	leia.close();
}
}