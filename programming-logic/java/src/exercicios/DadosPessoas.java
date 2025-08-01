package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, contMulheres, contHomens;
		double somaAlturaMulheres, mediaAlturaMulheres, menorAltura, maiorAltura;

	    System.out.print("Quantas pessoas serao digitadas? ");
		N = sc.nextInt();

	    double[] alturas = new double[N];
	    char[] generos = new char[N];

		for (int i = 0; i < N; i++) {
	    	System.out.printf("Altura da %da pessoa: ", i + 1);
	        alturas[i] = sc.nextDouble();
	        System.out.printf("Genero da %da pessoa: ", i + 1);
	        generos[i] = sc.next().charAt(0);
	    }

		menorAltura = alturas[0];
		maiorAltura = alturas[0];
		for (int i = 1; i < N; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}

		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);

		contHomens = 0;
		contMulheres = 0;
		somaAlturaMulheres = 0;
		for (int i = 0; i < N; i++) {
			if ((generos[i]=='F') || (generos[i]=='f')) {
				contMulheres++;
				somaAlturaMulheres = somaAlturaMulheres + alturas[i];
			}
		}

		if (contMulheres == 0) {
			System.out.printf("Impossivel calcular a altura media das mulheres\n");
		} else {
			mediaAlturaMulheres = somaAlturaMulheres / contMulheres;
			System.out.printf("Media das Alturas das mulheres = %.2f\n", mediaAlturaMulheres);
		}

		contHomens = N - contMulheres;
	    System.out.printf("Numero de homens = %d\n", contHomens);

		sc.close();
	}
}
