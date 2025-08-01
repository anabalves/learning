package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CadaLinha {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, maior;

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

		System.out.println("\nMAIOR ELEMENTO DE CADA LINHA:");
		for (int i = 0; i < N; i++) {
			maior = mat[i][0];
			for (int j = 0; j < N; j++) {
				if (maior < mat[i][j]) {
					maior = mat[i][j];
				}
			}
			System.out.printf("%d\n", maior);
	    }

		sc.close();
	}
}
