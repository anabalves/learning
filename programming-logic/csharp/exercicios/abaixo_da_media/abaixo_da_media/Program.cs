using System;
using System.Globalization;

namespace abaixo_da_media {

	class Program {

		static void Main(string[] args) {
			CultureInfo CI = CultureInfo.InvariantCulture;

			int N;
			double media, soma;

			Console.Write("Quantos elementos vai ter o vetor? ");
			N = int.Parse(Console.ReadLine());

			double[] vet = new double[N];

			for (int i = 0; i < N; i++) {
				Console.Write("Digite um numero: ");
				vet[i] = double.Parse(Console.ReadLine(), CI);
			}

			soma = 0;
			for (int i = 0; i < N; i++) {
				soma += vet[i];
			}

			media = soma / N;

			Console.WriteLine("\nMEDIA DO VETOR = " + media.ToString("F3", CI));
			
			Console.WriteLine("ELEMENTOS ABAIXO DA MEDIA:");
			for (int i = 0; i < N; i++) {
				if (vet[i] < media) {
					Console.WriteLine(vet[i].ToString("F1", CI));
				}
			}
		}

	}

}