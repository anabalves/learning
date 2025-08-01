using System;
using System.Globalization;

namespace aumento {

	class Program {

		static void Main(string[] args) {

			CultureInfo CI = CultureInfo.InvariantCulture;

			double salarioAtual, novosalario, aumento;
			int porcentagem;

			Console.Write("Digite o salario da pessoa: ");
			salarioAtual = double.Parse(Console.ReadLine(), CI);

			if (salarioAtual <= 1000.0) {
				porcentagem = 20;
			} else if (salarioAtual <= 3000.0) {
				porcentagem = 15;
			} else if (salarioAtual <= 8000.0) {
				porcentagem = 10;
			} else {
				porcentagem = 5;
			}

			aumento = salarioAtual * porcentagem / 100;
			novosalario = salarioAtual + aumento;

			Console.WriteLine("Novo salario = R$ " + novosalario.ToString("F2", CI));
			Console.WriteLine("Aumento = R$ " + aumento.ToString("F2", CI));
		    Console.WriteLine("Porcentagem = " + porcentagem + " %");
		
		}

	}

}