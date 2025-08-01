package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	    double soma, media;
		int N;

	    System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();

	    double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
	    	System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
	    }

		System.out.print("VALORES = ");
		for (int i = 0; i < N; i++) {
			System.out.printf("%.1f  ", vet[i]);
		}

		soma = 0;
		for (int i = 0; i < N; i++) {
			soma = soma + vet[i];
		}

		System.out.printf("\nSOMA = %.2f\n", soma);

		media = soma / N;
	    System.out.printf("MEDIA = %.2f\n", media);

		sc.close();
	}
}
