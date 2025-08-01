using System;
using System.Globalization;

namespace processamento_de_dados {

    class Program {
        
        static void Main(string[] args) {

            int a, b;
            a = 5;
            b = 2 * a;
            Console.WriteLine(a);
            Console.WriteLine(b);

            CultureInfo CI = CultureInfo.InvariantCulture;
            int c;
            double d;
            c = 5;
            d = 2 * c;
            Console.WriteLine(c);
            Console.WriteLine(d.ToString("F1", CI));

            double b1, b2, h, area;
            b1 = 6.0;
            b2 = 8.0;
            h = 5.0;
            area = (b1 + b2) / 2.0 * h;
            Console.WriteLine(area);

            int e, f, resultado;
            e = 5;
            f = 2;
            resultado = e / f;
            Console.WriteLine(resultado);

            double i;
            int j;
            i = 5.0;
            j = (int) i;
            Console.WriteLine(j);

        }

    }

}