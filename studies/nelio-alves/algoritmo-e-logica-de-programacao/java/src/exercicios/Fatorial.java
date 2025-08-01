package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, fatorial;

	    System.out.print("Digite o valor de N: ");
	    N = sc.nextInt();

		fatorial = 1;
		for (int i = N; i > 0; i--) {
	        fatorial = fatorial * i;
	    }

	    System.out.printf("FATORIAL = %d\n", fatorial);

		sc.close();
	}
}
