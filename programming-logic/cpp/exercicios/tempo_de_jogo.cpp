#include <iostream>

using namespace std;

int main() {
    int horaInicial, horaFinal, duracao;

    cout << "Hora inicial: ";
    cin >> horaInicial;

    cout << "Hora final: ";
    cin >> horaFinal;

    if (horaInicial < horaFinal) {
        duracao = horaFinal - horaInicial;
    } else {
        duracao = 24 - (horaInicial - horaFinal);
    }

    cout << "O JOGO DUROU " << duracao << " HORA(S)" << endl;

	return 0;
}
