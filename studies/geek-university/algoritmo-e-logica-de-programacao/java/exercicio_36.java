import java.util.Scanner;

public class exercicio_36 {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        boolean maiores_50 = false;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o valor para o vetor %d/10: ", (i + 1));
            vetor[i] = teclado.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (vetor[i] > 50) {
                System.out.printf("O numero %d esta na posicao %d\n", vetor[i], i);
                maiores_50 = true;
            }
        }

        if (!maiores_50) {
            System.out.println("Não existe nenhum numero maior que 50");
        }

        teclado.close();
    }

}
