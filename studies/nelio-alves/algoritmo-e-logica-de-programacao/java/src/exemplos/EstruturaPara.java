package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaPara {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i, x, soma;

        System.out.print("Quantos numeros serao digitados? ");
        N = sc.nextInt();

        soma = 0;
        for (i = 1; i <= N; i++) {
            System.out.print("Digite um numero: ");
            x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println("SOMA = " + soma);

        sc.close();
    }

}
