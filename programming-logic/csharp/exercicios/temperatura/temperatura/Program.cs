using System;
using System.Globalization;

namespace temperatura {

	class Program {

		static void Main(string[] args) {

			CultureInfo CI = CultureInfo.InvariantCulture;

			char escala;
			double tempFahrenheit, tempCelsius;

			Console.Write("Voce vai digitar a temperatura em qual escala (C/F)? ");
			escala = char.Parse(Console.ReadLine());

			if ((escala == 'F') || (escala == 'f')) {
				Console.Write("Digite a temperatura em Fahrenheit: ");
				tempFahrenheit = double.Parse(Console.ReadLine(), CI);

				tempCelsius = 5.0 / 9.0 * (tempFahrenheit - 32.0);
				Console.WriteLine("Temperatura equivalente em Celsius: " + tempCelsius.ToString("F2", CI));
			} else if ((escala == 'C') || (escala == 'c')) {
				Console.Write("Digite a temperatura em Celsius: ");
				tempCelsius = double.Parse(Console.ReadLine(), CI);

				tempFahrenheit = tempCelsius * 9.0 / 5.0 + 32.0;
				Console.WriteLine("Temperatura equivalente em Fahrenheit: " + tempFahrenheit.ToString("F2", CI));
			} else {
				Console.WriteLine("Escala invalida!");
			}

		}

	}

}