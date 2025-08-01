using System;

namespace cada_linha {

	class Program {

		static void Main(string[] args) {

			int N, maior;

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


			Console.WriteLine("MAIOR ELEMENTO DE CADA LINHA:");
			for (int i = 0; i < N; i++) {
				maior = mat[i, 0];
				for (int j = 0; j < N; j++) {
					if (maior < mat[i, j]) {
						maior = mat[i, j];
					}
				}
				Console.WriteLine(maior);
			}

		}

	}

}