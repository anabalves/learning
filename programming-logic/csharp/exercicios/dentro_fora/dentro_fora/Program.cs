using System;

namespace dentro_fora {

	class Program {

		static void Main(string[] args) {

			int N, X, fora, dentro;
			fora = 0;
			dentro = 0;

			Console.Write("Quantos numeros voce vai digitar? ");
			N = int.Parse(Console.ReadLine());

			for (int i = 0; i < N; i++) {
				Console.Write("Digite um numero: ");
				X = int.Parse(Console.ReadLine());

				if ((X >= 10) && (X <= 20)) {
					fora++;
				} else {
					dentro++;
				}
			}

			Console.WriteLine(dentro + " DENTRO");
			Console.WriteLine(fora + " FORA");

		}

	}

}