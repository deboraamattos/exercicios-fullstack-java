// Considerando um Programa iniciado pelos atributos A = 1, B = 2, C = 3, complete-o de modo que ao final do Programa o conteúdo de A seja 3, de B seja 1 e de C seja 2.
//Use apenas atribuições entre variáveis.


package lista1;

public class Exercicio12 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println("ANTES: A:" + a + " B:" + b + " C:" + c);
		
		int aux = a;
		a = c;
		c = b;
		b = aux;
		
		System.out.println("DEPOIS: A:" + a + " B:" + b + " C:" + c);
		

	}

}
