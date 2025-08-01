package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, posicao, maiorIdade;

	    System.out.print("Quantas pessoas voce vai digitar? ");
		N = sc.nextInt();

	    String[] nomes = new String[N];
	    int[] idades = new int[N];

		for (int i = 0; i < N; i++) {
	    	System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
	    }

		posicao = 0;
		maiorIdade = idades[0];

		for (int i = 1; i < N; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				posicao = i;
			}
		}

	    System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicao]);

		sc.close();
	}
}
