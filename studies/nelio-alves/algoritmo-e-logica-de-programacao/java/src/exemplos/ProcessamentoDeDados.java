package exemplos;

import java.util.Locale;

public class ProcessamentoDeDados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int a, b;
        a = 5;
        b = 2 * a;
        System.out.println(a);
        System.out.println(b);

        int c;
        double d;
        c = 5;
        d = 2 * c;
        System.out.println(c);
        System.out.println(String.format("%.1f", d));

        double b1, b2, h, area;
        b1 = 6.0;
        b2 = 8.0;
        h = 5.0;
        area = (b1 + b2) / 2.0 * h;
        System.out.println(area);

        int e, f, resultado;
        e = 5;
        f = 2;
        resultado = e / f;
        System.out.println(resultado);

        double i;
        int j;
        i = 5.0;
        j = (int) i;
        System.out.println(j);

    }

}
