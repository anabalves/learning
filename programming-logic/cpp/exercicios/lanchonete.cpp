#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int codigoProduto, quantidade;
    double valorPagamento;

    cout << "Codigo do produto comprado: ";
    cin >> codigoProduto;

    cout << "Quantidade comprada: ";
    cin >> quantidade;

    switch (codigoProduto) {
        case 1 :
            valorPagamento = quantidade * 5.00;
            break;

        case 2 :
            valorPagamento = quantidade * 3.50;
            break;

        case 3 :
            valorPagamento = quantidade * 4.80;
            break;

        case 4 :
            valorPagamento = quantidade * 8.90;
            break;

        case 5 :
            valorPagamento = quantidade * 7.32;
            break;
    }

    cout << fixed << setprecision(2);
    cout << "Valor a pagar: R$ " << valorPagamento << endl;

	return 0;
}
