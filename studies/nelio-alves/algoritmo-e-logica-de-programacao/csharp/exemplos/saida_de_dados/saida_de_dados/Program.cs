using System;
using System.Globalization;

namespace saida_de_dados {

    class Program {
        
        static void Main(string[] args) {

            Console.Write("Bom dia");
            Console.Write("Boa noite");

            Console.WriteLine("Bom dia");
            Console.WriteLine("Boa noite");

            int a, b;
            a = 10;
            b = 20;
            Console.WriteLine(a);
            Console.WriteLine(b);

            CultureInfo CI = CultureInfo.InvariantCulture;

            double x;
            x = 2.3456;
            Console.Write(x.ToString("F2", CI));

            int idade;
            double salario;
            string nome;
            char sexo;

            idade = 32;
            salario = 4560.9;
            nome = "Maria Silva";
            sexo = 'F';

            Console.WriteLine("A funcionaria " + nome + ", sexo " 
                + sexo + ", ganha " + salario.ToString("F2", CI) +
                " e tem " + idade + " anos");

        }

    }

}