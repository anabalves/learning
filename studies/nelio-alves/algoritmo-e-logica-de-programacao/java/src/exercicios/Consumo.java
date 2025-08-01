package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int distancia;
		double combustivel, consumo;

	    System.out.print("Distancia percorrida: ");
	    distancia = sc.nextInt();

	    System.out.print("Combustivel gasto: ");
		combustivel = sc.nextDouble();

	    consumo = distancia / combustivel;

		System.out.printf("Consumo medio = %.3f\n", consumo);

		sc.close();
	}
}
