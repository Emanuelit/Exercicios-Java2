package br.com.exercícios;

import java.util.Scanner;
public class Exercício2 {
//2- Faça um programa que entre com três números e coloque em ordem crescente.
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double n1, n2, n3;
	
	System.out.println("Digite os três números: ");	
	n1 = entrada.nextDouble();
	n2 = entrada.nextDouble();
	n3 = entrada.nextDouble();
	
	if(n1 <= n2  && n2 <= n3) {
		System.out.println("A ordem crescente é" + n1  + " " + n2 + " " + n3);
}
	else if(n1 <= n3 && n3 <= n2) {
		System.out.println("A ordem crescente é" + n1 + n3 + n2);	
	}
	else if(n2 <= n1 && n2 <= n3) {
		System.out.println("A ordem crescente é" + n2 + n1 + n3);	
	}
	else if(n2 <= n3 && n3 <= n1) {
		System.out.println("A ordem crescente é" + n2 + n3 + n1);	
	}
	else if(n3 <= n1 && n1 <= n2) {
		System.out.println("A ordem crescente é" + n3 + n1 + n2);	
	}
	else if(n3 <= n2 && n3 <= n1) {
		System.out.println("A ordem crescente é" + n3 + n2 + n1);	
	}
	entrada.close();
	
	}


}