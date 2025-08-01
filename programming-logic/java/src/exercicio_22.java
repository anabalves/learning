import java.util.Scanner;

public class exercicio_22 {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            if (numero > 0) {
                System.out.printf("O numero %d eh par e positivo.\n", numero);
            } else {
                System.out.printf("O numero %d eh par e negativo.\n", numero);
            }
        } else {
            if (numero > 0) {
                System.out.printf("O numero %d eh impar e positivo.\n", numero);
            } else {
                System.out.printf("O numero %d eh impar e negativo.\n", numero);
            }
        }

        teclado.close();
    }

}
