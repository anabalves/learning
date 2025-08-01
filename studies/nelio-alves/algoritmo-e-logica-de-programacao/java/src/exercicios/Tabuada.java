package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, produto;

		System.out.print("Deseja a Tabuada para qual valor? ");
		N = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			produto = N * i;
			System.out.printf("%d x %d = %d\n", N, i, produto);
	    }

		sc.close();
	}
}
