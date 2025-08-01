import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		int num1, num2, soma, multiplicacao;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o primeiro numero: ");
		num1 = teclado.nextInt();
		System.out.print("Informe o segundo numero: ");
		num2 = teclado.nextInt();

		soma = num1 + num2;
		multiplicacao = soma * num1;

		System.out.println("O resultado da multiplicacao eh " + multiplicacao);
		
		teclado.close();
	}

}
