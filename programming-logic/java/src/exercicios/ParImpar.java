package exercicios;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, num;

	    System.out.print("Quantos numeros voce vai digitar? ");
	    N = sc.nextInt();

		for (int i = 0; i < N; i++) {
	        System.out.print("Digite um numero: ");
			num = sc.nextInt();

			if (num == 0) {
	            System.out.println("NULO");
			} else {
				if (num % 2 == 0) {
	            	System.out.print("PAR");
				} else {
	            	System.out.print("IMPAR");
	            }

				if (num > 0) {
	            	System.out.println(" POSITIVO");
				} else {
	            	System.out.println(" NEGATIVO");
	            }
	        }
	    }

		sc.close();
	}
}
