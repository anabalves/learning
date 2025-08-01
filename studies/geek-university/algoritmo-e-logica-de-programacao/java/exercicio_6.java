import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe a quantidade minima: ");
		quantidade_minima = teclado.nextInt();
		
		System.out.print("Informe a quantidade maxima: ");
		quantidade_maxima = teclado.nextInt();

		estoque_medio = (float) ((quantidade_minima + quantidade_maxima) / 2);

		System.out.println("O estoque medio eh " + estoque_medio);
		
		teclado.close();
	}

}
