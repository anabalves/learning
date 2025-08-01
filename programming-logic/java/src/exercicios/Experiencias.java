package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, qtd, totalCobaias, totalSapos, totalCoelhos, totalRatos;
		char tipoCobaia;
		double pRatos, pSapos, pCoelhos;
		totalRatos = 0;
		totalCoelhos = 0;
		totalSapos = 0;

	    System.out.print("Quantos casos de teste serao digitados? ");
	    N = sc.nextInt();

		for (int i = 0; i < N; i++) {
	    	System.out.print("Quantidade de cobaias: ");
			qtd = sc.nextInt();
	        System.out.print("Tipo de cobaia: ");
			tipoCobaia = sc.next().charAt(0);

			if (tipoCobaia == 'R') {
				totalRatos = totalRatos + qtd;
			} else if (tipoCobaia == 'S') {
				totalSapos = totalSapos + qtd;
			} else {
				totalCoelhos = totalCoelhos + qtd;
			}
	    }

		totalCobaias = totalRatos + totalSapos + totalCoelhos;

		pCoelhos = ((double) totalCoelhos / totalCobaias) * 100.0;
		pRatos = ((double) totalRatos / totalCobaias) * 100.0;
		pSapos = ((double) totalSapos / totalCobaias) * 100.0;

	    System.out.println("\nRELATORIO FINAL:");
	    System.out.printf("Total: %d cobaias\n", totalCobaias);
	    System.out.printf("Total de coelhos: %d\n", totalCoelhos);
	    System.out.printf("Total de ratos: %d\n", totalRatos);
	    System.out.printf("Total de sapos: %d\n", totalSapos);
	    System.out.printf("Percentual de coelhos: %.2f\n", pCoelhos);
	    System.out.printf("Percentual de ratos: %.2f\n", pRatos);
	    System.out.printf("Percentual de sapos: %.2f\n", pSapos);

		sc.close();
	}
}
