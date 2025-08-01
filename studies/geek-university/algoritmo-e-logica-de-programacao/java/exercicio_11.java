import java.util.Scanner;

public class exercicio_11 {

    public static void main(String[] args) {
        float altura, peso_ideal;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual a sua altura? ");
        altura = teclado.nextFloat();

        peso_ideal = (float) (altura * 72.7) - 58;

        System.out.printf("Seu peso ideal seria %.2f", peso_ideal);

        teclado.close();
    }

}
