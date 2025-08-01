using System;
using System.Globalization;

namespace alturas {

	class Program {

		static void Main(string[] args) {
			CultureInfo CI = CultureInfo.InvariantCulture;

			int N, cont;
			double soma, media, porcentagem;

			Console.Write("Quantas pessoas serao digitadas? ");
			N = int.Parse(Console.ReadLine());

			string[] nomes = new string[N];
			int[] idades = new int[N];
			double[] alturas = new double[N];

			for (int i = 0; i < N; i++) {
				Console.WriteLine("Dados da " + (i + 1) + "a pessoa:");
				Console.Write("Nome: ");
				nomes[i] = Console.ReadLine();
				Console.Write("Idade: ");
				idades[i] = int.Parse(Console.ReadLine());
				Console.Write("Altura: ");
				alturas[i] = double.Parse(Console.ReadLine(), CI);
			}

			cont = 0;
			soma = 0;
			for (int i = 0; i < N; i++) {
				if (idades[i] < 16) {
					cont++;
				}
				soma += alturas[i];
			}

			media = soma / N;
			porcentagem = ((double) cont / N) * 100.0;

			Console.WriteLine("\nAltura media = " + media.ToString("F2", CI));
			Console.WriteLine("Pessoas com menos de 16 anos: " + porcentagem.ToString("F1", CI));

			for (int i = 0; i < N; i++) {
				if (idades[i] < 16) {
					Console.WriteLine(nomes[i]);
				}
			}
		}

	}

}