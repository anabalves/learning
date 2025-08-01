using System;
using System.Globalization;

namespace dardo {

	class Program {

		static void Main(string[] args) {

			CultureInfo CI = CultureInfo.InvariantCulture;

			double distDardo1, distDardo2, distDardo3, maior;

			Console.WriteLine("Digite as tres distancias:");
			distDardo1 = double.Parse(Console.ReadLine(), CI);
			distDardo2 = double.Parse(Console.ReadLine(), CI);
			distDardo3 = double.Parse(Console.ReadLine(), CI);

			if ((distDardo1 > distDardo2) && (distDardo1 > distDardo3)) {
				maior = distDardo1;
			} else if (distDardo2 > distDardo3) {
				maior = distDardo2;
			} else {
				maior = distDardo3;
			}

			Console.WriteLine("MAIOR DISTANCIA = " + maior.ToString("F2", CI));
		
		}

	}

}