package br.com.exercícios;

import java.util.Scanner;
public class Exercício3 {
	/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
		 10-14 infantil
		 15-17 juvenil
		 18-25 adulto
		*/
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		System.out.println("Digite sua idade");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <14) {
			System.out.println("Você está na categoria Infantil");
	}
		else if(idade >=14 && idade <17) {
			System.out.println("Você está na categoria Juvenil");	
		}
		else if(idade >=17 && idade <=25) {
			System.out.println("Você está na categoria Adulto");	
		}
		else { 
			System.out.println("Você digitou a idade incorreta");
		}
		leia.close();
}
}
