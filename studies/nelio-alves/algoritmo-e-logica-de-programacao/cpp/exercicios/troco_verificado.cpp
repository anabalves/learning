#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double precoUnitario, dinheiro, troco, valorRestante, total;
    int quantComprada;

    cout << "Preco unitario do produto: ";
    cin >> precoUnitario;

    cout << "Quantidade comprada: ";
    cin >> quantComprada;

    cout << "Dinheiro recebido: ";
    cin >> dinheiro;

    cout << fixed << setprecision(2);

    total = precoUnitario * quantComprada;

    if (dinheiro > total) {
        troco = dinheiro - total;
        cout << "TROCO = " << troco << endl;
    } else {
        valorRestante = total - dinheiro;
        cout << "DINHEIRO INSUFICIENTE. FALTAM " << valorRestante << endl;
    }

	return 0;
}
