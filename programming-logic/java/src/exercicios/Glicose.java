package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double medidaGlicose;

	    System.out.print("Digite a medida da Glicose: ");
		medidaGlicose = sc.nextDouble();

		if (medidaGlicose <= 100) {
			System.out.print("Classificacao: normal");
		}
		else if (medidaGlicose <= 140) {
			System.out.print("Classificacao: elevado");
		} else {
			System.out.print("Classificacao: diabetes");
		}

		sc.close();
	}
}
