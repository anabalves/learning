import java.util.Scanner;

public class exercicio_25 {

    public static void main(String[] args) {
        int numero, maior = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        numero = teclado.nextInt();

        while (numero != 0) {
            if (numero > maior) {
                maior = numero;
            }
            System.out.println("Informe um numero: ");
            numero = teclado.nextInt();
        }

        System.out.printf("O maior numero eh %d", maior);
        teclado.close();
    }

}
