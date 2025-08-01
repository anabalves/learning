using System;

namespace soma_impares {

	class Program {

		static void Main(string[] args) {

			int X, Y, troca, soma;

			Console.WriteLine("Digite dois numeros:");
			X = int.Parse(Console.ReadLine());
			Y = int.Parse(Console.ReadLine());

			if (X > Y) {
				troca = X;
				X = Y;
				Y = troca;
			}

			soma = 0;
			for (int i = X + 1; i <= Y - 1; i++) {
				if (i % 2 != 0) {
					soma = soma + i;
				}
			}

			Console.WriteLine("SOMA DOS IMPARES = " + soma);

		}

	}

}