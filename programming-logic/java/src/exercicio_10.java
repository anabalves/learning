import java.util.Scanner;

public class exercicio_10 {

	public static void main(String[] args) {
		float valor_por_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Qual o valor voce ganha por hora? ");
		valor_por_hora = teclado.nextFloat();
		
		System.out.print("Quantas horas voce trabalhou neste mes? ");
		horas_trabalhadas = teclado.nextInt();

		salario = (horas_trabalhadas * valor_por_hora);

		System.out.println("Neste mes voce vai receber R$ " + salario);
		
		teclado.close();
	}

}
