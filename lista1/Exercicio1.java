// Fa�a um programa que, dado o valor da conta de uma refei��o realizada em um restaurante, acrescente os 10% do gar�om e exiba o valor total da conta.


package lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor da refei��o: ");
		double valorRefeicao = input.nextDouble();
				
		System.out.println("Total conta: "+ valorRefeicao*1.10);

	}

}
