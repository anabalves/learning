package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaMatrizes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M, N;

		System.out.print("Quantas linhas vai ter cada matriz? ");
		M = sc.nextInt();
	    System.out.print("Quantas colunas vai ter cada matriz? ");
		N = sc.nextInt();

	    int[][] A = new int[M][N];
	    int[][] B = new int[M][N];
	    int[][] C = new int[M][N];

	    System.out.println("Digite os valores da matriz A:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
	        	System.out.printf("Elemento [%d,%d]: ", i, j);
				A[i][j] = sc.nextInt();
	        }
	    }

	    System.out.println("Digite os valores da matriz B:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
	        	System.out.printf("Elemento [%d,%d]: ", i, j);
				B[i][j] = sc.nextInt();
	        }
	    }

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}

		System.out.println("\nMATRIZ A:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%d ", A[i][j]);
			}
			System.out.println();
		}

		System.out.println("\nMATRIZ B:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%d ", B[i][j]);
			}
			System.out.println();
		}

	    System.out.println("\nMATRIZ SOMA:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
	        	System.out.printf("%d ", C[i][j]);
	        }
	        System.out.println();
	    }

		sc.close();
	}
}
