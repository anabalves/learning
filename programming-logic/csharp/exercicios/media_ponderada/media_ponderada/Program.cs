using System;
using System.Globalization;

namespace media_ponderada {

	class Program {

		static void Main(string[] args) {
			CultureInfo CI = CultureInfo.InvariantCulture;

			int N;
			double a, b, c, media;

			Console.Write("Quantos casos voce vai digitar? ");
			N = int.Parse(Console.ReadLine());

			for (int i = 0; i < N; i++) {
				Console.WriteLine("Digite tres numeros:");
				a = double.Parse(Console.ReadLine(), CI);
				b = double.Parse(Console.ReadLine(), CI);
				c = double.Parse(Console.ReadLine(), CI);

				media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

				Console.WriteLine("MEDIA = " + media.ToString("F1", CI));
			}
		}

	}

}