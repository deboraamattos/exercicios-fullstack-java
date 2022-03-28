//Faça um Programa que leia as seguintes informações de um funcionário: matricula,nome, idade, sexo, endereço, bairro e estado civil. Escreva o nome do funcionário.


package lista1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a matricula do funcionario: ");
		String matricula = input.nextLine();
		
		System.out.println("Digite o nome do funcionario: ");
		String nome = input.nextLine();
		
		System.out.println("Digite a idade do funcionario: ");
		int idade = input.nextInt();
		
		System.out.println("Digite o sexo do funcionario: ");
		String sexo = input.nextLine();
		
		System.out.println("Digite o endereço do funcionario: ");
		String endereco = input.nextLine();
		
		System.out.println("Digite o bairro do funcionario: ");
		String bairro = input.nextLine();
		
		System.out.println("Digite o estado civil do funcionario: ");
		String estadoCivil = input.nextLine();
			
		System.out.println("Funcionario: "+ nome);

	}

}
