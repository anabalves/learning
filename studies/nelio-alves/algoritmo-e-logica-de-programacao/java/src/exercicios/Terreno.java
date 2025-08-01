package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valor, area, preco;

	    System.out.print("Digite a largura do Terreno: ");
	    largura = sc.nextDouble();

	    System.out.print("Digite o comprimento do Terreno: ");
	    comprimento = sc.nextDouble();

	    System.out.print("Digite o valor do metro quadrado: ");
	    valor = sc.nextDouble();

	    area = largura * comprimento;
		preco = area * valor;

	    System.out.printf("Area do Terreno = %.2f\n", area);
	    System.out.printf("Preco do Terreno = %.2f\n", preco);

		sc.close();
	}
}
