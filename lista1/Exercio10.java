//Fa�a um programa para ler o c�digo, a descri��o, a quantidade, o pre�o de compra e o percentual de lucro de uma mercadoria. Calcular o valor da venda com base no 
//percentual de lucro e, ainda, calcular o pre�o total em �R$� entre o pre�o da venda e a quantidade. Ao final, escrever o pre�o de compra, o percentual de lucro, 
//o pre�o da venda, a quantidade e o pre�o total.


package lista1;

import java.util.Scanner;

public class Exercio10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o codigo do produto: ");
		String codigo = input.nextLine();
		
		System.out.println("Digite a descri��o do produto: ");
		String descricao = input.nextLine();
		
		System.out.println("Digite a quantidade: ");
		int quantidade = input.nextInt();
		
		System.out.println("Digite o pre�o de compra do produto: ");
		double precoCompra = input.nextDouble();
		
		System.out.println("Digite o percentual de lucro do produto: ");
		double lucro = input.nextDouble();
		
		double valorVenda = precoCompra * (1 + lucro/100);
		
		System.out.println("Pre�o de compra: " + precoCompra);
		System.out.println("Percentual de lucro: " + lucro);
		System.out.println("Pre�o de venda: " + valorVenda);
		System.out.println("Pre�o total: " + (precoCompra * quantidade));
		
	}

}
