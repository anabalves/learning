#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int quantMinutos, minutosExcedentes;
    double valorPagamento;

    cout << "Digite a quantidade de minutos: ";
    cin >> quantMinutos;

    valorPagamento  = 50.0;

    if (quantMinutos  > 100) {
        minutosExcedentes = quantMinutos - 100;
        valorPagamento = valorPagamento + minutosExcedentes * 2.0;
    }

    cout << fixed << setprecision(2);
    cout << "Valor a pagar: R$ " << valorPagamento << endl;

	return 0;
}
