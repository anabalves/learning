import java.util.Scanner;

public class exercicio_28 {

    public static void main(String[] args) {
        int valor, maior = -999, menor = 999, soma = 0;
        float media;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um valor: ");
            valor = teclado.nextInt();

            if (valor > 0) {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
                soma = soma + valor;
            } else {
                i--;
            }
        }

        media = (float) soma / 10;
        System.out.println("O maior numero eh " + maior);
        System.out.println("O menor numero eh " + menor);
        System.out.println("A media dos numeros eh " + media);
        teclado.close();
    }

}
