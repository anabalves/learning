package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, raio;

	    System.out.print("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();

	    area = Math.PI * Math.pow(raio, 2);

	    System.out.printf("AREA = %.3f\n", area);

		sc.close();
	}
}
