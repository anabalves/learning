using System;
using System.Globalization;

namespace operadora {

	class Program {

		static void Main(string[] args) {

			CultureInfo CI = CultureInfo.InvariantCulture;

			int quantMinutos, minutosExcedentes;
			double valorPagamento;

			Console.Write("Digite a quantidade de minutos: ");
			quantMinutos = int.Parse(Console.ReadLine());

			valorPagamento = 50.0;

			if (quantMinutos > 100) {
				minutosExcedentes = quantMinutos - 100;
				valorPagamento = valorPagamento + minutosExcedentes * 2.0;
			}

			Console.WriteLine("Valor a pagar: R$ " + valorPagamento.ToString("F2", CI));
		
		}

	}

}