//Faça um programa para ler o código, a descrição, a quantidade, o preço de compra e o percentual de lucro de uma mercadoria. Calcular o valor da venda com base no 
//percentual de lucro e, ainda, calcular o preço total em “R$” entre o preço da venda e a quantidade. Ao final, escrever o preço de compra, o percentual de lucro, 
//o preço da venda, a quantidade e o preço total.


package lista1;

import java.util.Scanner;

public class Exercio10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o codigo do produto: ");
		String codigo = input.nextLine();
		
		System.out.println("Digite a descrição do produto: ");
		String descricao = input.nextLine();
		
		System.out.println("Digite a quantidade: ");
		int quantidade = input.nextInt();
		
		System.out.println("Digite o preço de compra do produto: ");
		double precoCompra = input.nextDouble();
		
		System.out.println("Digite o percentual de lucro do produto: ");
		double lucro = input.nextDouble();
		
		double valorVenda = precoCompra * (1 + lucro/100);
		
		System.out.println("Preço de compra: " + precoCompra);
		System.out.println("Percentual de lucro: " + lucro);
		System.out.println("Preço de venda: " + valorVenda);
		System.out.println("Preço total: " + (precoCompra * quantidade));
		
	}

}
