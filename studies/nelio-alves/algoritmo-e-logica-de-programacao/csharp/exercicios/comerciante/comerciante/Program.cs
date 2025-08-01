using System;
using System.Globalization;

namespace comerciante {

	class Program {

		static void Main(string[] args) {
			CultureInfo CI = CultureInfo.InvariantCulture;

			int N, abaixo, entre, acima;
			double totalCompra, totalVenda, totalLucro, lucro, percentualLucro;

			Console.Write("Serao digitados dados de quantos produtos? ");
			N = int.Parse(Console.ReadLine());

			string[] nomes = new string[N];
			double[] precosCompra = new double[N];
			double[] precosVenda = new double[N];

			for (int i = 0; i < N; i++) {
				Console.WriteLine("Produto " + (i + 1) + ":");
				Console.Write("Nome: ");
				nomes[i] = Console.ReadLine();
				Console.Write("Preco de compra: ");
				precosCompra[i] = double.Parse(Console.ReadLine(), CI);
				Console.Write("Preco de venda: ");
				precosVenda[i] = double.Parse(Console.ReadLine(), CI);
			}

			abaixo = 0;
			entre = 0;
			acima = 0;
			for (int i = 0; i < N; i++) {
				lucro = precosVenda[i] - precosCompra[i];
				percentualLucro = lucro * 100.0 / precosCompra[i];

				if (percentualLucro < 10.0) {
					abaixo++;
				} else if (percentualLucro < 20.0) {
					entre++;
				} else {
					acima++;
				}
			}

			totalCompra = 0;
			totalVenda = 0;
			for (int i = 0; i < N; i++) {
				totalCompra += precosCompra[i];
				totalVenda += precosVenda[i];
			}

			totalLucro = totalVenda - totalCompra;

			Console.WriteLine("\nRELATORIO:");
			Console.WriteLine("Lucro abaixo de 10%: " + abaixo);
			Console.WriteLine("Lucro entre 10% e 20%: " + entre);
			Console.WriteLine("Lucro acima de 20%: " + acima);
			Console.WriteLine("Valor total de compra: " + totalCompra.ToString("F2", CI));
			Console.WriteLine("Valor total de venda: " + totalVenda.ToString("F2", CI));
			Console.WriteLine("Lucro total: " + totalLucro.ToString("F2", CI));
		}

	}

}