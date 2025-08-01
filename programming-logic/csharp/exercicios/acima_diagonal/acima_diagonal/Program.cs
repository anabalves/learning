using System;

namespace acima_diagonal {

	class Program {

		static void Main(string[] args) {

			int N, soma;

			Console.Write("Qual a ordem da matriz? ");
			N = int.Parse(Console.ReadLine());

			int[ , ] mat = new int[N, N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write("Elemento [" + i + "," + j + "]: ");
					mat[i, j] = int.Parse(Console.ReadLine());
				}
			}

			Console.WriteLine("MATRIZ DIGITADA:");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write(mat[i, j] + " ");
				}
				Console.WriteLine();
			}

			soma = 0;
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					soma += mat[i, j];
				}
			}

			Console.WriteLine("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
		}

	}

}