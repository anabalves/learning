package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, soma;

	    System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();

	    int[][] mat = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
	        	System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
	        }
	    }

		System.out.println("\nMATRIZ DIGITADA:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		soma = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				soma = soma + mat[i][j];
			}
		}

	    System.out.printf("\nSOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d\n", soma);

		sc.close();
	}
}
