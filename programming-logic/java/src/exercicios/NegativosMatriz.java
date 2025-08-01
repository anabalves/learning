package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class NegativosMatriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M, N;

	    System.out.print("Qual a quantidade de linhas da matriz? ");
		M = sc.nextInt();
	    System.out.print("Qual a quantidade de colunas da matriz? ");
		N = sc.nextInt();

	    int[][] mat = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
	        	System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
	        }
	    }
		
	    System.out.println("VALORES NEGATIVOS:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
	            	System.out.printf("%d\n", mat[i][j]);
	            }
	        }
	    }

		sc.close();
	}
}
