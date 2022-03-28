//Faça um programa que leia dois números inteiros e escreva a soma entre eles


package lista1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int valor1 = input.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int valor2 = input.nextInt();
			
		System.out.println("Soma: "+(valor1 + valor2));


	}

}
