using System;
using System.Globalization;

namespace aprovados {

	class Program {

		static void Main(string[] args) {
			CultureInfo CI = CultureInfo.InvariantCulture;

			int N;
			double media;

			Console.Write("Quantos alunos serao digitados? ");
			N = int.Parse(Console.ReadLine());

			string[] nomes = new string[N];
			double[] notasPrimeiroSemestre = new double[N];
			double[] notasSegundoSemestre = new double[N];

			for (int i = 0; i < N; i++) {
				Console.WriteLine("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
				nomes[i] = Console.ReadLine();
				notasPrimeiroSemestre[i] = double.Parse(Console.ReadLine(), CI);
				notasSegundoSemestre[i] = double.Parse(Console.ReadLine(), CI);
			}

			Console.WriteLine("Alunos aprovados:");
			for (int i = 0; i < N; i++) {
				media = (notasPrimeiroSemestre[i] + notasSegundoSemestre[i]) / 2;

				if (media >= 6.0) {
					Console.WriteLine(nomes[i]);
				}
			}
		}

	}

}