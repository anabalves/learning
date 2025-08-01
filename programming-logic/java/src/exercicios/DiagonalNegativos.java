package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, cont;

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

	    System.out.println("\nDIAGONAL PRINCIPAL:");
		for (int i = 0; i < N; i++) {
	    	System.out.printf("%d ", mat[i][i]);
	    }

		cont = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					cont++;
				}
			}
		}

		if (cont == 0) {
			System.out.print("\n\nNao ha negativos na matriz");
		} else {
			System.out.printf("\n\nQUANTIDADE DE NEGATIVOS = %d\n", cont);
		}

		sc.close();
	}
}
