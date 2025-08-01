using System;
using System.Globalization;

namespace lanchonete {

	class Program {

		static void Main(string[] args) {

			CultureInfo CI = CultureInfo.InvariantCulture;

			int codigoProduto, quantidade;
			double valorPagamento;

			Console.Write("Codigo do produto comprado: ");
			codigoProduto = int.Parse(Console.ReadLine());

			Console.Write("Quantidade comprada: ");
			quantidade = int.Parse(Console.ReadLine());

			valorPagamento = 0;
			switch (codigoProduto) {
				case 1:
					valorPagamento = quantidade * 5.00;
					break;

				case 2:
					valorPagamento = quantidade * 3.50;
					break;

				case 3:
					valorPagamento = quantidade * 4.80;
					break;

				case 4:
					valorPagamento = quantidade * 8.90;
					break;

				case 5:
					valorPagamento = quantidade * 7.32;
					break;
			}

			Console.WriteLine("Valor a pagar: R$ " + valorPagamento.ToString("F2", CI));
		
		}

	}

}