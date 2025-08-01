package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, soma, cont;
		double media;

	    System.out.print("Quantos elementos vai ter o vetor? ");
		N = sc.nextInt();

	    int[] vet = new int[N];

		for (int i = 0; i < N; i++) {
	    	System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
	    }

		cont = 0;
		soma = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				soma = soma + vet[i];
				cont++;
			}
		}

		if (cont == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			media = (double) soma / cont;

			System.out.printf("MEDIA DOS PARES = %.1f\n", media);
		}

		sc.close();
	}
}
