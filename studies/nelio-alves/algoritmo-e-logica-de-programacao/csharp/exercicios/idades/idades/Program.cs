using System;
using System.Globalization;

namespace idades {

    class Program {

        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;

            string nomePrimeiraPessoa, nomeSegundaPessoa;
            int idadePrimeiraPessoa, idadeSegundaPessoa;
            double idadeMedia;

            Console.WriteLine("Dados da primeira pessoa:");
            Console.Write("Nome: ");
            nomePrimeiraPessoa = Console.ReadLine();
            Console.Write("Idade: ");
            idadePrimeiraPessoa = int.Parse(Console.ReadLine());

            Console.WriteLine("Dados da segunda pessoa:");
            Console.Write("Nome: ");
            nomeSegundaPessoa = Console.ReadLine();
            Console.Write("Idade: ");
            idadeSegundaPessoa = int.Parse(Console.ReadLine());

            idadeMedia = (idadePrimeiraPessoa + idadeSegundaPessoa) / 2.0;

            Console.WriteLine("A idade media de " + nomePrimeiraPessoa + " e " + nomeSegundaPessoa + " eh de " + idadeMedia.ToString("F2", CI) + " anos");
        
        }

    }

}