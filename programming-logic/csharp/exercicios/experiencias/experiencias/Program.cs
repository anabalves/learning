using System;
using System.Globalization;

namespace experiencias {

	class Program {

		static void Main(string[] args) {
			CultureInfo CI = CultureInfo.InvariantCulture;

			int N, qtd, totalCobaias, totalSapos, totalCoelhos, totalRatos;
			char tipoCobaia;
			double pRatos, pSapos, pCoelhos;

			Console.Write("Quantos casos de teste serao digitados? ");
			N = int.Parse(Console.ReadLine());

			totalRatos = 0;
			totalCoelhos = 0;
			totalSapos = 0;

			for (int i = 0; i < N; i++) {
				Console.Write("Quantidade de cobaias: ");
				qtd = int.Parse(Console.ReadLine());
				Console.Write("Tipo de cobaia: ");
				tipoCobaia = char.Parse(Console.ReadLine());

				if ((tipoCobaia == 'R') || (tipoCobaia == 'r')) {
					totalRatos = totalRatos + qtd;
				} else if ((tipoCobaia == 'S') || (tipoCobaia == 's')) {
					totalSapos = totalSapos + qtd;
				} else {
					totalCoelhos = totalCoelhos + qtd;
				}
			}

			totalCobaias = totalRatos + totalSapos + totalCoelhos;

			pCoelhos = ((double)totalCoelhos / totalCobaias) * 100.0;
			pRatos = ((double)totalRatos / totalCobaias) * 100.0;
			pSapos = ((double)totalSapos / totalCobaias) * 100.0;

			Console.WriteLine("\nRELATORIO FINAL:");
			Console.WriteLine("Total: " + totalCobaias + " cobaias");
			Console.WriteLine("Total de coelhos: " + totalCoelhos);
			Console.WriteLine("Total de ratos: " + totalRatos);
			Console.WriteLine("Total de sapos: " + totalSapos);
			Console.WriteLine("Percentual de coelhos: " + pCoelhos.ToString("F2", CI));
			Console.WriteLine("Percentual de ratos: " + pRatos.ToString("F2", CI));
			Console.WriteLine("Percentual de sapos: " + pSapos.ToString("F2", CI));
		}
	}
}