import java.util.ArrayList;
import java.util.List;

public class exercicio_32 {

    public static void main(String[] args) {
        List<Integer> vetor = new ArrayList<Integer>();
        List<Integer> pares = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            vetor.add(i);
            if (i % 2 == 0) {
                if (i > 0) {
                    pares.add(i);
                }
            }
        }

        for (Integer numero : pares) {
            System.out.println(numero);
        }
    }

}
