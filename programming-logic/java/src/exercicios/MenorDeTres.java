package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, menor;

	    System.out.print("Primeiro valor: ");
		num1 = sc.nextInt();
		
	    System.out.print("Segundo valor: ");
		num2 = sc.nextInt();
		
	    System.out.print("Terceiro valor: ");
		num3 = sc.nextInt();

		if ((num1 < num2) && (num1 < num3)) {
			menor = num1;
		} else if (num2 < num3) {
			menor = num2;
		} else {
			menor = num3;
		}
		
	    System.out.printf("MENOR = %d\n", menor);

		sc.close();
	}
}
