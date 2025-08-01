package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double precoUnitario, dinheiro, troco, valorRestante, total;
		int quantComprada;

		System.out.print("Preco unitario do produto: ");
		precoUnitario = sc.nextDouble();

	    System.out.print("Quantidade comprada: ");
		quantComprada = sc.nextInt();

	    System.out.print("Dinheiro recebido: ");
	    dinheiro = sc.nextDouble();

		total = precoUnitario * quantComprada;

		if (dinheiro > total) {
			troco = dinheiro - total;
			System.out.printf("TROCO = %.2f\n", troco);
		} else {
			valorRestante = total - dinheiro;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS\n", valorRestante);
		}

		sc.close();
	}
}
