import java.util.Scanner;

public class exercicio_16 {

    public static void main(String[] args) {
        int numero, a, b;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        numero = teclado.nextInt();

        if (numero == 0) {
            System.out.println("O valor " + numero + " eh neutro.");
        } else if (numero > 0) {
            a = numero;
            System.out.println("O valor " + a + " eh positivo.");
        } else {
            b = numero;
            System.out.println("O valor " + b + " eh negativo.");
        }

        teclado.close();
    }

}
