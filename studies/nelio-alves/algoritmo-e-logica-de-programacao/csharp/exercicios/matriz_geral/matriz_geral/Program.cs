using System;
using System.Globalization;

namespace matriz_geral {

	class Program {

		static void Main(string[] args) {
			CultureInfo CI = CultureInfo.InvariantCulture;

			int N, linha, coluna;
			double somaPositivos;

			Console.Write("Qual a ordem da matriz? ");
			N = int.Parse(Console.ReadLine());

			double[ , ] mat = new double[N, N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write("Elemento [" + i + "," + j + "]: ");
					mat[i, j] = double.Parse(Console.ReadLine(), CI);
				}
			}

			Console.WriteLine("\nMATRIZ DIGITADA:");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write(mat[i, j] + " ");
				}
				Console.WriteLine();
			}

			somaPositivos = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (mat[i, j] > 0) {
						somaPositivos += mat[i, j];
					}
				}
			}

			Console.WriteLine("\nSOMA DOS POSITIVOS: " + somaPositivos.ToString("F1", CI) + "\n");

			Console.Write("Escolha uma linha: ");
			linha = int.Parse(Console.ReadLine());

			Console.Write("LINHA ESCOLHIDA: ");
			for (int i = 0; i < N; i++) {
				Console.Write(mat[linha, i].ToString("F1", CI) + " ");
			}

			Console.Write("\n\nEscolha uma coluna: ");
			coluna = int.Parse(Console.ReadLine());

			Console.Write("COLUNA ESCOLHIDA: ");
			for (int i = 0; i < N; i++) {
				Console.Write(mat[i, coluna].ToString("F1", CI) + " ");
			}

			Console.Write("\n\nDIAGONAL PRINCIPAL: ");
			for (int i = 0; i < N; i++) {
				Console.Write(mat[i, i].ToString("F1", CI) + " ");
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (mat[i, j] < 0) {
						mat[i, j] = Math.Pow(mat[i, j], 2);
					}
				}
			}

			Console.WriteLine("\n\nMATRIZ ALTERADA:");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					Console.Write(mat[i, j].ToString("F1", CI) + " ");
				}
				Console.WriteLine();
			}

		}

	}

}