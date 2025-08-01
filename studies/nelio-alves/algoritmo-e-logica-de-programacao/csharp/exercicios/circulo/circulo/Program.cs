using System;
using System.Globalization;

namespace circulo {

    class Program {

        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;

            double area, raio;

            Console.Write("Digite o valor do raio do circulo: ");
            raio = double.Parse(Console.ReadLine(), CI);

            area = Math.PI * Math.Pow(raio, 2);

            Console.WriteLine("AREA = " + area.ToString("F3", CI));
        
        }

    }

}