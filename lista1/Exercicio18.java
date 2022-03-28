// Elabore um programa que, dada a idade de um nadador, classifique-o em uma das seguintes categorias:
// • Infantil A = 5 – 7 anos
// • Infantil B = 8 – 10 anos
// • Juvenil A = 11 – 13 anos
// • Juvenil B = 14 – 17 anos
// • Sênior = maiores de 18 anos

package lista1;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a idade do nadador: ");
		int idade = input.nextInt();
		
		String categoria; 
		
		if (idade >=5 && idade <=7) {
			categoria = "Infantil A";
			}else if (idade >=8 && idade <=10) {
			categoria = "Infantil B";
			}else if (idade >11 && idade <=13) {
			categoria = "Juvenil A";
			}else if (idade >=14 && idade <=17) {
			categoria = "Juvenil B";
			}else {
			categoria = "Senior";
			}

		System.out.println("A categoria do nadador é: " + categoria);
			
		}

	}


