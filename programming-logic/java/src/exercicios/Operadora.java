package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantMinutos, minutosExcedentes;
		double valorPagamento;

	    System.out.print("Digite a quantidade de minutos: ");
		quantMinutos = sc.nextInt();

		valorPagamento = 50.0;

		if (quantMinutos > 100) {
			minutosExcedentes = quantMinutos - 100;
			valorPagamento = valorPagamento + minutosExcedentes * 2.0;
		}
		
	    System.out.printf("Valor a pagar: R$ %.2f\n", valorPagamento);

		sc.close();
	}
}
