using System;
using System.Globalization;

namespace maior_posicao {

	class Program {

		static void Main(string[] args) {
			CultureInfo CI = CultureInfo.InvariantCulture;

			int N, posicao;
			double maiorValor;

			Console.Write("Quantos numeros voce vai digitar? ");
			N = int.Parse(Console.ReadLine());

			double[] vet = new double[N];

			for (int i = 0; i < N; i++) {
				Console.Write("Digite um numero: ");
				vet[i] = double.Parse(Console.ReadLine(), CI);
			}

			posicao = 0;
			maiorValor = vet[0];

			for (int i = 1; i < N; i++) {
				if (vet[i] > maiorValor) {
					maiorValor = vet[i];
					posicao = i;
				}
			}

			Console.WriteLine("\nMAIOR VALOR = " + maiorValor.ToString("F1", CI));
			Console.WriteLine("POSICAO DO MAIOR VALOR = " + posicao);
		}

	}

}