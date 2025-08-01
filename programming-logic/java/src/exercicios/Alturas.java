package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, cont;
		double soma, media, porcentagem;

	    System.out.print("Quantas pessoas serao digitadas? ");
		N = sc.nextInt();

	    String[] nomes = new String[N];
	    int[] idades = new int[N];
	    double[] alturas = new double[N];

		for (int i = 0; i < N; i++) {
	    	System.out.printf("Dados da %da pessoa:\n", i + 1);
	    	System.out.print("Nome: ");
	        nomes[i] = sc.next();
	        System.out.print("Idade: ");
	        idades[i] = sc.nextInt();
	        System.out.print("Altura: ");
	        alturas[i] = sc.nextDouble();
	    }

		cont = 0;
		soma = 0;
		for (int i = 0; i < N; i++) {
			if (idades[i] < 16) {
				cont++;
			}
			soma = soma + alturas[i];
		}

		media = soma / N;
		porcentagem = ((double) cont / N) * 100.0;

	    System.out.printf("\nAltura media = %.2f\n", media);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

		for (int i = 0; i < N; i++) {
			if (idades[i] < 16) {
	        	System.out.printf("%s\n", nomes[i]);
	        }
	    }

		sc.close();
	}
}
