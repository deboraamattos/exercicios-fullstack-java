//Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um programa que calcule seu peso ideal, utilizando as seguintes fórmulas:
// • Para homens: (72.7 * altura) – 58;
// • Para mulheres: (62.1 * altura) – 44.7;

package lista1;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		float altura = 1.73f;
		char sexo = 'F';
		float pesoIdeal =0f;
			
		
		if(sexo == 'F') {
			pesoIdeal = (62.1f * altura) - 44.7f;
			}else if (sexo == 'M') {
			pesoIdeal = (72.7f * altura) - 58f;
			}else {
			System.out.println("Valor informado é invalido! Verifique.");
			}
			System.out.println("Peso ideal: "+ pesoIdeal);
	}

}
