package br.com.exerc�cios;

import java.util.Scanner;
public class Exerc�cio2 {
//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double n1, n2, n3;
	
	System.out.println("Digite os tr�s n�meros: ");	
	n1 = entrada.nextDouble();
	n2 = entrada.nextDouble();
	n3 = entrada.nextDouble();
	
	if(n1 <= n2  && n2 <= n3) {
		System.out.println("A ordem crescente �" + n1  + " " + n2 + " " + n3);
}
	else if(n1 <= n3 && n3 <= n2) {
		System.out.println("A ordem crescente �" + n1 + n3 + n2);	
	}
	else if(n2 <= n1 && n2 <= n3) {
		System.out.println("A ordem crescente �" + n2 + n1 + n3);	
	}
	else if(n2 <= n3 && n3 <= n1) {
		System.out.println("A ordem crescente �" + n2 + n3 + n1);	
	}
	else if(n3 <= n1 && n1 <= n2) {
		System.out.println("A ordem crescente �" + n3 + n1 + n2);	
	}
	else if(n3 <= n2 && n3 <= n1) {
		System.out.println("A ordem crescente �" + n3 + n2 + n1);	
	}
	entrada.close();
	
	}


}