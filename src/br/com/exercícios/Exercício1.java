package br.com.exercícios;

import java.util.Scanner;
public class Exercício1 {
//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
	int numero1, numero2, numero3;
	
	System.out.println("Digite o primeiro número: ");
	numero1 = leia.nextInt();
	
	System.out.println("Digite o segundo número: ");
	numero2 = leia.nextInt();
			
	System.out.println("Digite o terceiro número: ");
	numero3 = leia.nextInt();
	
	if(numero1 > numero2 && numero1 > numero3) {
		
		System.out.println("Esse é o maior número dentre os três" + numero1);
		}
	else if(numero2 > numero1 && numero2 >  numero3) {
		System.out.println("Esse é o maior número dentre os três" + numero2);
			}
	else if(numero3 > numero1 && numero3 > numero2) {
		System.out.println("Esse é o maior número dentre os três" + numero3);
	}
	else {
		System.out.println("número inválido");
	}
	leia.close();
}
}