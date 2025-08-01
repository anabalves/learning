using System;

namespace tempo_de_jogo {

	class Program {

		static void Main(string[] args) {

			int horaInicial, horaFinal, duracao;

			Console.Write("Hora inicial: ");
			horaInicial = int.Parse(Console.ReadLine());

			Console.Write("Hora final: ");
			horaFinal = int.Parse(Console.ReadLine());

			if (horaInicial < horaFinal) {
				duracao = horaFinal - horaInicial;
			} else {
				duracao = 24 - (horaInicial - horaFinal);
			}

			Console.WriteLine("O JOGO DUROU " + duracao + " HORA(S)");
		
		}

	}

}