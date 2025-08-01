using System;
using System.Globalization;

namespace troco_verificado {

	class Program {

		static void Main(string[] args) {

			CultureInfo CI = CultureInfo.InvariantCulture;

			double precoUnitario, dinheiro, troco, valorRestante, total;
			int quantComprada;

			Console.Write("Preco unitario do produto: ");
			precoUnitario = double.Parse(Console.ReadLine(), CI);

			Console.Write("Quantidade comprada: ");
			quantComprada = int.Parse(Console.ReadLine());

			Console.Write("Dinheiro recebido: ");
			dinheiro = double.Parse(Console.ReadLine(), CI);

			total = precoUnitario * quantComprada;

			if (dinheiro > total) {
				troco = dinheiro - total;
				Console.WriteLine("TROCO = " + troco.ToString("F2", CI));
			} else {
				valorRestante = total - dinheiro;
				Console.WriteLine("DINHEIRO INSUFICIENTE. FALTAM " + valorRestante.ToString("F2", CI));
			}

		}

	}

}