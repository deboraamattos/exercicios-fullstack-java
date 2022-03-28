// Faça um Programa que obtenha o salário-base e o número de dependentes de um funcionário e informe o salário bruto (igual ao salário-base + R$ 100,00 por dependente), 
//e o salário líquido, sabendo-se que o desconto para o INSS é de 10% sobre o salário-base.


package lista1;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o salario-base: ");
		double salarioBase = input.nextDouble();
		
		System.out.println("Digite a quantidade de dependentes: ");
		int dependente = input.nextInt();
		
		double salarioBruto = (100.00 * dependente) + salarioBase;
		
		double salarioLiquido = salarioBruto - (salarioBase * 0.1);
		
		System.out.println("Salario Bruto: " + salarioBruto);
		
		System.out.println("Salario Liquido: " + salarioLiquido);
		
	}

}
