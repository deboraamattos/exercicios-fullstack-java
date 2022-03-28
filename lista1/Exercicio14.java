// Faça um Programa que calcule a quantidade necessária de tinta e o número de latas,para pintar uma parede de Xm de largura por Ym de altura. Considere que o consumo 
//de tinta é de 3 litros por metro quadrado e a quantidade de tinta por lata é de 2 litros.


package lista1;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a largura da parede: ");
		float larguraParede = input.nextFloat();
		
		System.out.println("Informe a altura da parede: ");
		float alturaParede = input.nextFloat();

		float litros = (larguraParede * alturaParede) * 3;
		
		float latas = litros / 2;
		
		System.out.println("Quantidade de tinta em litros: " + litros);
		
		System.out.println("Quantidade de latas: " + latas);
	}

}
