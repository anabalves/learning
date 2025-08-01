package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salarioAtual, novosalario, aumento;
		int porcentagem;

	    System.out.print("Digite o salario da pessoa: ");
		salarioAtual = sc.nextDouble();

		if (salarioAtual <= 1000.0) {
			porcentagem = 20;
		} else if (salarioAtual <= 3000.0) {
			porcentagem = 15;
		} else if (salarioAtual <= 8000.0) {
			porcentagem = 10;
		} else {
			porcentagem = 5;
		}

		aumento = salarioAtual * porcentagem / 100;
		novosalario = salarioAtual + aumento;

		System.out.printf("Novo salario = R$ %.2f\n", novosalario);
		System.out.printf("Aumento = R$ %.2f\n", aumento);
		System.out.printf("Porcentagem = %d %%\n", porcentagem);

		sc.close();
	}
}
