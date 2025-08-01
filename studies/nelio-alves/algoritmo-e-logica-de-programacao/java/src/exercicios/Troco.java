package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double precoUnitario, dinheiroRecebido, troco;
		int qtd;

	    System.out.print("Preco unitario do produto: ");
		precoUnitario = sc.nextDouble();

	    System.out.print("Quantidade comprada: ");
	    qtd = sc.nextInt();

	    System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();

		troco = dinheiroRecebido - (precoUnitario * qtd);

	    System.out.printf("TROCO = %.2f\n", troco);

		sc.close();
	}
}
