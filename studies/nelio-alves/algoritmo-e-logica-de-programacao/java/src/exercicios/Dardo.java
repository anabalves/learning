package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double distDardo1, distDardo2, distDardo3, maior;

	    System.out.println("Digite as tres distancias:");
		distDardo1 = sc.nextDouble();
		distDardo2 = sc.nextDouble();
		distDardo3 = sc.nextDouble();

		if ((distDardo1 > distDardo2) && (distDardo1 > distDardo3)) {
			maior = distDardo1;
		} else if (distDardo2 > distDardo3) {
			maior = distDardo2;
		} else {
			maior = distDardo3;
		}

	    System.out.printf("MAIOR DISTANCIA = %.2f\n", maior);

		sc.close();
	}
}
