import java.util.Scanner;

public class exercicio_19 {

    public static void main(String[] args) {
        float p, m, e;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o peso dos peixes: ");
        p = teclado.nextFloat();

        if (p > 50) {
            e = (p - 50);
            m = (float) (e * 4.00);
            System.out.printf("Você devera pagar R$ %.2f em multas", m);
        } else {
            m = 0;
            e = 0;

            System.out.println("Multas: " + m);
            System.out.println("Excesso: " + e);
        }

        teclado.close();
    }

}
