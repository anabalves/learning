package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N;
		double media;

	    System.out.print("Quantos alunos serao digitados? ");
		N = sc.nextInt();

	    String[] nomes = new String[N];
	    double[] notasPrimeiroSemestre = new double[N];
	    double[] notasSegundoSemestre = new double[N];

		for (int i = 0; i < N; i++) {
	    	System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
	        sc.nextLine();
	        nomes[i] = sc.nextLine();
			notasPrimeiroSemestre[i] = sc.nextDouble();
			notasSegundoSemestre[i] = sc.nextDouble();
	    }

	    System.out.println("Alunos Aprovados:");
		for (int i = 0; i < N; i++) {
			media = (notasPrimeiroSemestre[i] + notasSegundoSemestre[i]) / 2;

			if (media >= 6.0) {
	            System.out.printf("%s\n", nomes[i]);
	        }
	    }

		sc.close();
	}
}
