using System;
using System.Globalization;

namespace coordenadas {

	class Program {

		static void Main(string[] args) {

			CultureInfo CI = CultureInfo.InvariantCulture;

			double x, y;

			Console.Write("Valor de X: ");
			x = double.Parse(Console.ReadLine(), CI);

			Console.Write("Valor de Y: ");
			y = double.Parse(Console.ReadLine(), CI);

			if ((x > 0) && (y > 0)) {
				Console.WriteLine("Q1");
			} else if ((x < 0) && (y > 0)) {
				Console.WriteLine("Q2");
			} else if ((x < 0) && (y < 0)) {
				Console.WriteLine("Q3");
			} else if ((x > 0) && (y < 0)) {
				Console.WriteLine("Q4");
			} else if ((x == 0) && (y == 0)) {
				Console.WriteLine("Origem");
			} else if (x == 0) {
				Console.WriteLine("Eixo Y");
			} else {
				Console.WriteLine("Eixo X");
			}

		}

	}

}