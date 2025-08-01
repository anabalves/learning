package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, posicao;
		double maiorValor;

	    System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();

	    double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
	    	System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
	    }

		posicao = 0;
		maiorValor = vet[0];

		for (int i = 1; i < N; i++) {
			if (vet[i] > maiorValor) {
				maiorValor = vet[i];
				posicao = i;
			}
		}
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maiorValor);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);

		sc.close();
	}
}
