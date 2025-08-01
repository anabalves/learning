import java.util.Scanner;

public class exercicio_20 {

    public static void main(String[] args) {
        int codigo;
        float qtd_horas, e = 0, salario, valor_hora = (float) 10.00;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o codigo: ");
        codigo = teclado.nextInt();
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        qtd_horas = teclado.nextFloat();

        if (qtd_horas > 50) {
            e = (float) ((qtd_horas - 50) * 20.00);
            salario = (50 * valor_hora) + e;
            System.out.printf("Salario Total R$ %.2f\n", salario);
            System.out.printf("Salario excedente R$ %.2f\n", e);
        } else {
            salario = qtd_horas * valor_hora;
            System.out.printf("Salario Total R$ %.2f\n", salario);
            System.out.printf("Salario excedente R$ %.2f\n", e);
        }

        teclado.close();
    }

}
