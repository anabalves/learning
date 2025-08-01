using System;

namespace fatorial {

	class Program {

		static void Main(string[] args) {

			int N, fatorial;

			Console.Write("Digite o valor de N: ");
			N = int.Parse(Console.ReadLine());

			fatorial = 1;
			for (int i = N; i > 0; i--) {
				fatorial = fatorial * i;
			}

			Console.WriteLine("FATORIAL = " + fatorial);

		}

	}

}