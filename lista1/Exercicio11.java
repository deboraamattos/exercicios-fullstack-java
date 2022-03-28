// Faça um programa para ler o nome e o ano, mês e dia de nascimento de um cidadão. Calcular e informar sua idade.


package lista1;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o dia de nascimento: ");
		int diaNascimento = input.nextInt();
		
		System.out.println("Digite o mes de nascimento: ");
		int mesNascimento = input.nextInt();
		
		System.out.println("Digite o ano de nascimento: ");
		int anoNascimento = input.nextInt();
		
		System.out.println("Digite o dia atual: ");
		int diaAtual = input.nextInt();
		
		System.out.println("Digite o mes atual: ");
		int mesAtual = input.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = input.nextInt();
		
		int idade = 0;
		
		if(mesAtual > mesNascimento || (mesAtual>=mesNascimento && diaAtual>=diaNascimento)) {
				idade = anoAtual-anoNascimento;
		}else {
				idade = anoAtual-anoNascimento-1;
		}
				System.out.println("Idade: "+ idade);

		
		
		
	}

}
