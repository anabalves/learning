package exemplos;

import java.util.Scanner;
import java.util.Locale;

public class EstruturaEnquanto {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, soma;

        System.out.print("Digite o primeiro numero: ");
        x = sc.nextInt();

        soma = 0;
        while (x != 0) {
            soma = soma + x;
            System.out.print("Digite outro numero: ");
            x = sc.nextInt();
        }

        System.out.println("SOMA = " + soma);

        sc.close();
    }

}
