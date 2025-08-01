package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.print("Digite uma hora do dia: ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        } else {
            System.out.println("Boa tarde!");
        }

        sc.close();

    }

}
