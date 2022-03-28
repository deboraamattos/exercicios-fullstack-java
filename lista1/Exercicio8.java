//Faça um programa para ler o nome e as três notas de um aluno. Calcular a média e escrever o nome e a média. Variáveis utilizadas: NOME, N1, N2, N3, MEDIA.


package lista1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = input.nextLine();
		
		System.out.println("Digite a primeira nota: ");
		float n1 = input.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float n2 = input.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		float n3 = input.nextFloat();
		
		
		float media = (n1+n2+n3)/3;
		
		System.out.println("Nome: "+ nome);
		
		System.out.println("Media: "+ media);
	}

}
