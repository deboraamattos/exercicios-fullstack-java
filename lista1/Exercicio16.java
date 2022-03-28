// Em um aeroporto, a balança de bagagem envia a informação de peso da bagagem desacompanhada para um computador que calcula o valor do excesso de peso com os seguintes 
//parâmetros:


package lista1;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o peso da bagagem: ");
		float pesoBagagem = input.nextFloat();
		
		float excesso = 0f;
		
		if (pesoBagagem <= 20) {
			excesso = 0;			
		}else if (pesoBagagem >=40) {
			excesso = (pesoBagagem - 40)*10000;
		}else {
			excesso = (pesoBagagem-20)*5000 ;
		}
		
		System.out.println("Excesso a pagar: " + excesso);
	}

}
