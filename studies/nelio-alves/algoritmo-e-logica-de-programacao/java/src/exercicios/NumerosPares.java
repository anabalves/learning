package exercicios;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, cont;

	    System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();

	    int[] vet = new int[N];

		for (int i = 0; i < N; i++) {
	    	System.out.print("Digite um numero: ");
	        vet[i] = sc.nextInt();
	    }

		cont = 0;
		System.out.println("\nNUMEROS PARES:");
		for (int i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
	        	System.out.printf("%d  ", vet[i]);
				cont++;
	        }
	    }

		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", cont);

		sc.close();
	}
}
