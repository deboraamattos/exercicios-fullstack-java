//Faça um programa que calcule o resto da divisão inteira entre dois números dados.Exemplo: se dividirmos 25 por 4, temos resto=1


package lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int valor1 = input.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int valor2 = input.nextInt();
				
		System.out.println("Resto: "+ valor1%valor2);

	}

}
