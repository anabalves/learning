package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X, Y, troca, soma;

	    System.out.println("Digite dois numeros:");
		X = sc.nextInt();
		Y = sc.nextInt();

		if (X > Y) {
			troca = X;
			X = Y;
			Y = troca;
		}

		soma = 0;
		for (int i = X + 1; i <= Y - 1; i++) {

			if (i % 2 != 0) {
				soma = soma + i;
			}

		}

	    System.out.printf("SOMA DOS IMPARES = %d\n", soma);

		sc.close();
	}
}
