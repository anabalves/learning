package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoProduto, quantidade;
		double valorPagamento;

	    System.out.print("Codigo do produto comprado: ");
		codigoProduto = sc.nextInt();

	    System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();

		valorPagamento = 0;
		switch (codigoProduto) {
			case 1 :
				valorPagamento = quantidade * 5.00;
				break;

			case 2 :
				valorPagamento = quantidade * 3.50;
				break;

			case 3 :
				valorPagamento = quantidade * 4.80;
				break;

			case 4 :
				valorPagamento = quantidade * 8.90;
				break;

			case 5 :
				valorPagamento = quantidade * 7.32;
				break;
		}

	    System.out.printf("Valor a pagar: R$ %.2f\n", valorPagamento);

		sc.close();
	}
}
