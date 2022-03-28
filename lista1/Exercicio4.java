// Escreva um programa que, dados o valor da mercadoria e o valor pago, calcule e exiba o troco a ser devolvido.


package lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor da mercadoria:");
		double valorMercadoria = input.nextDouble();
		
		System.out.println("Digite o valor pago:");
		double valorPago = input.nextDouble();
			
		System.out.println("Troco: " + (valorPago - valorMercadoria));

	}

}
