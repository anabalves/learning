package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DentroFora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, X, fora, dentro;
		fora = 0;
		dentro = 0;

	    System.out.print("Quantos numeros voce vai digitar? ");
	    N = sc.nextInt();

		for (int i = 0; i < N; i++) {
	    	System.out.print("Digite um numero: ");
	        X = sc.nextInt();

			if ((X >= 10) && (X <= 20)) {
				dentro++;
			} else {
				fora++;
			}
	    }
		
	    System.out.printf("%d DENTRO\n", dentro);
	    System.out.printf("%d FORA\n", fora);

		sc.close();
	}
}
