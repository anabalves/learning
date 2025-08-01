using System;

namespace menor_de_tres {

	class Program {

		static void Main(string[] args) {

			int num1, num2, num3, menor;

			Console.Write("Primeiro valor: ");
			num1 = int.Parse(Console.ReadLine());

			Console.Write("Segundo valor: ");
			num2 = int.Parse(Console.ReadLine());

			Console.Write("Terceiro valor: ");
			num3 = int.Parse(Console.ReadLine());

			if ((num1 < num2) && (num1 < num3)) {
				menor = num1;
			} else if (num2 < num3) {
				menor = num2;
			} else {
				menor = num3;
			}

			Console.WriteLine("MENOR = " + menor);

		}

	}

}