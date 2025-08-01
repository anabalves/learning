using System;

namespace soma_matrizes {

	class Program {

		static void Main(string[] args) {

			int M, N;

			Console.Write("Quantas linhas vai ter cada matriz? ");
			M = int.Parse(Console.ReadLine());
			Console.Write("Quantas colunas vai ter cada matriz? ");
			N = int.Parse(Console.ReadLine());

			int[,] A = new int[M, N];
			int[,] B = new int[M, N];
			int[,] C = new int[M, N];

			Console.WriteLine("Digite os valores da matriz A:");
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write("Elemento [" + i + "," + j + "]: ");
					A[i, j] = int.Parse(Console.ReadLine());
				}
			}

			Console.WriteLine("Digite os valores da matriz B:");
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write("Elemento [" + i + "," + j + "]: ");
					B[i, j] = int.Parse(Console.ReadLine());
				}
			}

			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					C[i, j] = A[i, j] + B[i, j];
				}
			}

			Console.WriteLine("\nMATRIZ A:");
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write(A[i, j] + " ");
				}
				Console.WriteLine();
			}

			Console.WriteLine("\nMATRIZ B:");
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write(B[i, j] + " ");
				}
				Console.WriteLine();
			}

			Console.WriteLine("\nMATRIZ SOMA:");
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write(C[i, j] + " ");
				}
				Console.WriteLine();
			}

		}

	}

}