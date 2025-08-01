using System;

namespace par_impar {

	class Program {

		static void Main(string[] args) {

			int N, num;

			Console.Write("Quantos numeros voce vai digitar? ");
			N = int.Parse(Console.ReadLine());

			for (int i = 0; i < N; i++) {
				Console.Write("Digite um numero: ");
				num = int.Parse(Console.ReadLine());

				if (num == 0) {
					Console.WriteLine("NULO");
				} else {
					if (num % 2 == 0) {
						Console.Write("PAR");
					} else {
						Console.Write("IMPAR");
					}

					if (num > 0) {
						Console.WriteLine(" POSITIVO");
					} else {
						Console.WriteLine(" NEGATIVO");
					}
				}
			}

		}

	}

}