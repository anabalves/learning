using System;
using System.Globalization;

namespace dados_pessoas {

	class Program {

		static void Main(string[] args) {
			CultureInfo CI = CultureInfo.InvariantCulture;

			int N, contMulheres, contHomens;
			double somaAlturaMulheres, mediaAlturaMulheres, menorAltura, maiorAltura;

			Console.Write("Quantas pessoas serao digitadas? ");
			N = int.Parse(Console.ReadLine());

			double[] alturas = new double[N];
			char[] generos = new char[N];

			for (int i = 0; i < N; i++) {
				Console.Write("Altura da " + (i + 1) + "a pessoa: ");
				alturas[i] = double.Parse(Console.ReadLine(), CI);
				Console.Write("Genero da " + (i + 1) + "a pessoa: ");
				generos[i] = char.Parse(Console.ReadLine());
			}

			menorAltura = alturas[0];
			maiorAltura = alturas[0];
			for (int i = 1; i < N; i++) {
				if (alturas[i] > maiorAltura) {
					maiorAltura = alturas[i];
				}

				if (alturas[i] < menorAltura) {
					menorAltura = alturas[i];
				}
			}

			Console.WriteLine("Menor altura = " + menorAltura.ToString("F2", CI));
			Console.WriteLine("Maior altura = " + maiorAltura.ToString("F2", CI));
            
			contMulheres = 0;
			somaAlturaMulheres = 0;
			for (int i = 0; i < N; i++) {
				if ((generos[i] == 'F') || (generos[i] == 'f')) {
					contMulheres++;
					somaAlturaMulheres += alturas[i];
				}
			}

			if (contMulheres == 0) {
				Console.WriteLine("Impossivel calcular a altura media das mulheres");
			} else {
				mediaAlturaMulheres = somaAlturaMulheres / contMulheres;
				Console.WriteLine("Media das alturas da mulheres = " + mediaAlturaMulheres.ToString("F2", CI));
			}

			contHomens = N - contMulheres;
			Console.WriteLine("Numero de homens = " + contHomens);
		}

	}

}