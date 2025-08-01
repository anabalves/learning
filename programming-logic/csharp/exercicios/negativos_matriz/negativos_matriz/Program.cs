using System;

namespace negativos_matriz {

	class Program {

		static void Main(string[] args) {

			int M, N;

			Console.Write("Qual a quantidade de linhas da matriz? ");
			M = int.Parse(Console.ReadLine());
			Console.Write("Qual a quantidade de colunas da matriz? ");
			N = int.Parse(Console.ReadLine());

			int[,] mat = new int[M, N];

			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write("Elemento [" + i + "," + j + "]: ");
					mat[i, j] = int.Parse(Console.ReadLine());
				}
			}

			Console.WriteLine("VALORES NEGATIVOS:");
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (mat[i, j] < 0) {
						Console.WriteLine(mat[i, j]);
					}
				}
			}

		}

	}

}