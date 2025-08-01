using System;

namespace diagonal_negativos {

	class Program {

		static void Main(string[] args) {

			int N, cont;

			Console.Write("Qual a ordem da matriz? ");
			N = int.Parse(Console.ReadLine());

			int[,] mat = new int[N, N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write("Elemento [" + i + "," + j + "]: ");
					mat[i, j] = int.Parse(Console.ReadLine());
				}
			}

			Console.WriteLine("\nMATRIZ DIGITADA:");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write(mat[i, j] + " ");
				}
				Console.WriteLine();
			}

			Console.WriteLine("\nDIAGONAL PRINCIPAL:");
			for (int i = 0; i < N; i++)	{
				Console.Write(mat[i, i] + " ");
			}

			cont = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (mat[i, j] < 0) {
						cont++;
					}
				}
			}

			if (cont == 0) {
				Console.WriteLine("\n\nNao ha negativos na matriz");
			} else {
				Console.WriteLine("\n\nQUANTIDADE DE NEGATIVOS = " + cont);
			}

		}

	}

}