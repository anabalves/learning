using System;

namespace tabuada {

	class Program {

		static void Main(string[] args) {

			int N, produto;

			Console.Write("Deseja a tabuada para qual valor? ");
			N = int.Parse(Console.ReadLine());

			for (int i = 1; i <= 10; i++) {
				produto = N * i;
				Console.WriteLine(N + " x " + i + " = " + produto);
			}

		}

	}

}