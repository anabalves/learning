using System;
using System.Globalization;

namespace glicose {

	class Program {

		static void Main(string[] args) {

			CultureInfo CI = CultureInfo.InvariantCulture;

			double glicose;

			Console.Write("Digite a medida da glicose: ");
			glicose = double.Parse(Console.ReadLine(), CI);

			if (glicose <= 100) {
				Console.WriteLine("Classificacao: normal");
			} else if (glicose <= 140) {
				Console.WriteLine("Classificacao: elevado");
			} else {
				Console.WriteLine("Classificacao: diabetes");
			}

		}

	}

}