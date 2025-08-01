package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char escala;
		double tempFahrenheit, tempCelsius;

	    System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
	    escala = sc.next().charAt(0);

		if ((escala == 'F') || (escala == 'f')) {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			tempFahrenheit = sc.nextDouble();

			tempCelsius = 5.0 / 9.0 * (tempFahrenheit - 32.0);
			System.out.printf("Temperatura equivalente em Celsius: %.2f\n", tempCelsius);
		} else if ((escala == 'C') || (escala == 'c')) {
			System.out.print("Digite a temperatura em Celsius: ");
			tempCelsius = sc.nextDouble();

			tempFahrenheit = tempCelsius * 9.0 / 5.0 + 32.0;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", tempFahrenheit);
		} else {
			System.out.print("Escala invalida!");
		}

		sc.close();
	}
}
