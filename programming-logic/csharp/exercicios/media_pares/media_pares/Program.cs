using System;
using System.Globalization;

namespace media_pares {

	class Program {

		static void Main(string[] args) {
			CultureInfo CI = CultureInfo.InvariantCulture;

			int N, soma, cont;
			double media;

			Console.Write("Quantos elementos vai ter o vetor? ");
			N = int.Parse(Console.ReadLine());

			int[] vet = new int[N];

			for (int i = 0; i < N; i++) {
				Console.Write("Digite um numero: ");
				vet[i] = int.Parse(Console.ReadLine());
			}

			cont = 0;
			soma = 0;
			for (int i = 0; i < N; i++) {
				if (vet[i] % 2 == 0) {
					soma += vet[i];
					cont++;
				}
			}

			if (cont == 0) {
				Console.WriteLine("NENHUM NUMERO PAR");
			} else {
				media = (double) soma / cont;

				Console.WriteLine("MEDIA DOS PARES = " + media.ToString("F1", CI));
			}
		}

	}

}