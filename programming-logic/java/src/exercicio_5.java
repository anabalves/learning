import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		int codigo, quantidade;
		float valor, total;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o codigo da peca: ");
		codigo = teclado.nextInt();

		System.out.print("Informe o valor da peca: ");
		valor = teclado.nextFloat();

		System.out.print("Informe a quantidade de pecas: ");
		quantidade = teclado.nextInt();

		total = quantidade * valor;

		System.out.println("Codigo da peca: " + codigo);
		System.out.println("Valor total: " + total);
		
		teclado.close();
	}

}
