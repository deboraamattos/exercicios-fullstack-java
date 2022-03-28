//Escreva um programa que, dados três números, informe o maior e o menor.


package lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int valor1 = input.nextInt();
		
		System.out.println("Digite o segundo valor:");
		int valor2 = input.nextInt();
		
		System.out.println("Digite o terceiro valor:");
		int valor3 = input.nextInt();
		
		if(valor1 > valor2 && valor1 > valor3) {
			System.out.println("Maior: "+ valor1);
		}else if(valor2 > valor1 && valor2 > valor3) {
			System.out.println("Maior: "+ valor2);
		}else {
			System.out.println("Maior: "+ valor3);
		}
		
		if(valor1 < valor2 && valor1 < valor3) {
			System.out.println("Menor: "+ valor1);
		}else if(valor2 < valor1 && valor2 < valor3) {
			System.out.println("Menor: "+ valor2);
		}else {
			System.out.println("Menor: "+ valor3);
		}
	}
}


	


