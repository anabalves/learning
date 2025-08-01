using System;
using System.Globalization;

namespace troco {

	class Program {

		static void Main(string[] args) {

			CultureInfo CI = CultureInfo.InvariantCulture;

			double precoUnitario, dinheiroRecebido, troco;
			int qtd;

			Console.Write("Preco unitario do produto: ");
			precoUnitario = double.Parse(Console.ReadLine(), CI);

			Console.Write("Quantidade comprada: ");
			qtd = int.Parse(Console.ReadLine());

			Console.Write("Dinheiro recebido: ");
			dinheiroRecebido = double.Parse(Console.ReadLine(), CI);

			troco = dinheiroRecebido - (precoUnitario * qtd);

			Console.WriteLine("TROCO = " + troco.ToString("F2", CI));
		
		}

	}

}