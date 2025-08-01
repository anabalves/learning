using System;

namespace mais_velho {

	class Program {

		static void Main(string[] args) {

			int N, posicao, maiorIdade;

			Console.Write("Quantas pessoas voce vai digitar? ");
			N = int.Parse(Console.ReadLine());

			string[] nomes = new string[N];
			int[] idades = new int[N];

			for (int i = 0; i < N; i++) {
				Console.WriteLine("Dados da " + (i + 1) + "a pessoa:");
				Console.Write("Nome: ");
				nomes[i] = Console.ReadLine();
				Console.Write("Idade: ");
				idades[i] = int.Parse(Console.ReadLine());
			}

			posicao = 0;
			maiorIdade = idades[0];

			for (int i = 1; i < N; i++) {
				if (idades[i] > maiorIdade) {
					maiorIdade = idades[i];
					posicao = i;
				}
			}

			Console.WriteLine("PESSOA MAIS VELHA: " + nomes[posicao]);
		}

	}

}