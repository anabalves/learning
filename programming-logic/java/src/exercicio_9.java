import java.util.Scanner;

public class exercicio_9 {

	public static void main(String[] args) {
		int metros, centimetros;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o valor em metros: ");
		metros = teclado.nextInt();

		centimetros = (metros * 100);

		System.out.println(metros + " metros em centimetros eh " + centimetros);
		
		teclado.close();
	}

}
