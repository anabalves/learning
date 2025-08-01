import java.util.Scanner;

public class exercicio_23 {

    public static void main(String[] args) {
        float indice;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o indice de poluicao: ");
        indice = teclado.nextFloat();

        if (indice >= 0.3 && indice < 0.4) {
            System.out.println("As empresas do 1 grupo devem parar as atividades.");
        } else if (indice >= 0.4 && indice < 0.5) {
            System.out.println("As empresas do 1 e 2 grupos devem parar as atividades.");
        } else if (indice >= 0.5) {
            System.out.println("Todas as empresas devem parar suas atividades.");
        } else {
            System.out.println("Niveis aceitaveis.");
        }

        teclado.close();
    }

}
