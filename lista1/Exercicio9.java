//Faça um programa para ler o nome, departamento e o salário de um funcionário. Calcular e informar um abono de 10% (dez por cento) sobre o salário e, ainda, o novo 
//salário acrescido do abono.


package lista1;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionario: ");
		String nome = input.nextLine();
		
		System.out.println("Digite o departamento: ");
		String departamento = input.nextLine();
		
		System.out.println("Digite o salario: ");
		double salario = input.nextDouble();
					
				
		System.out.println("Abono: "+ salario*0.1);
		System.out.println("Novo salario: "+ salario*1.1);

	}

}
