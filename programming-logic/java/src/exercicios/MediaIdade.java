package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaIdade {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade, soma, cont;
		double media;
		soma = 0;
		cont = 0;

	    System.out.println("Digite as Idades:");
	    idade = sc.nextInt();

	    if (idade < 0) {
	    	System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			while (idade >= 0) {
				soma = soma + idade;
				cont = cont + 1;

	            idade = sc.nextInt();
	        }

			media = (double) soma / cont;

	        System.out.printf("MEDIA = %.2f\n", media);
	    }

		sc.close();
	}
}
