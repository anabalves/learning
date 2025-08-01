using System;
using System.Globalization;

namespace medidas {

	class Program {

		static void Main(string[] args) {

			CultureInfo CI = CultureInfo.InvariantCulture;

			double A, B, C, areaQuadrado, areaTriangulo, areaTrapezio;

			Console.Write("Digite a medida A: ");
			A = double.Parse(Console.ReadLine(), CI);

			Console.Write("Digite a medida B: ");
			B = double.Parse(Console.ReadLine(), CI);

			Console.Write("Digite a medida C: ");
			C = double.Parse(Console.ReadLine(), CI);

			areaQuadrado = A * A;
			areaTriangulo = (A * B) / 2;
			areaTrapezio = ((A + B) * C) / 2;

			Console.WriteLine("AREA DO QUADRADO = " + areaQuadrado.ToString("F4", CI));
			Console.WriteLine("AREA DO TRIANGULO = " + areaTriangulo.ToString("F4", CI));
			Console.WriteLine("AREA DO TRAPEZIO = " + areaTrapezio.ToString("F4", CI));
		
		}

	}

}