import java.util.Scanner;

public class exercicio_18 {

    public static void main(String[] args) {
        float altura, peso_ideal;
        char sexo;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe sua altura: ");
        altura = teclado.nextFloat();

        System.out.print("Informe o sexo m/f: ");
        sexo = teclado.next().charAt(0);

        if (sexo == 'm' || sexo == 'M') {
            peso_ideal = (float) (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal eh %.2f", peso_ideal);
        } else if (sexo == 'f' || sexo == 'F') {
            peso_ideal = (float) (62.1 * altura) - (float) 44.7;
            System.out.printf("Seu peso ideal eh %.2f", peso_ideal);
        } else {
            System.out.println("Sexo nao reconhecido.");
        }

        teclado.close();
    }

}
