//Construa um programa que, dado o valor de uma mercadoria, sejam aplicados 15% de desconto em uma venda à vista e exiba o valor a ser pago.


package lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor da mercadoria:");
		double valorMercadoria = input.nextDouble();
		
		//double valorMercadoria = 150.0;
		
		System.out.println("Valor a vista com desconto: " + (valorMercadoria - (valorMercadoria * 0.15)));

	}

}
