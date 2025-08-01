#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double precoUnitario, dinheiroRecebido, troco;
    int qtd;

    cout << "Preco unitario do produto: ";
    cin >> precoUnitario;

    cout << "Quantidade comprada: ";
    cin >> qtd;

    cout << "Dinheiro recebido: ";
    cin >> dinheiroRecebido;

    troco = dinheiroRecebido - (precoUnitario * qtd);

    cout << fixed << setprecision(2);
    cout << "TROCO = " << troco << endl;

	return 0;
}
