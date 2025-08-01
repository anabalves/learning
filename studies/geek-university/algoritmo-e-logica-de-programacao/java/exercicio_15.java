import java.util.Scanner;

public class exercicio_15 {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        numero = teclado.nextInt();

        if (numero > 100) {
            System.out.println(numero);
        } else {
            numero = 0;
            System.out.println(numero);
        }

        teclado.close();
    }

}
