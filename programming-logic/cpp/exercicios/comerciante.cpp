#include <iostream>
#include <iomanip>

using namespace std;

int main(){
    int N, abaixo, entre, acima;
    double totalCompra, totalVenda, totalLucro, lucro, percentualLucro;

    cout << "Serao digitados dados de quantos produtos? ";
    cin >> N;

    string nomes[N];
    double precosCompra[N], precosVenda[N];

    for (int i = 0; i < N; i++) {
        cout << "Produto " << i + 1 << ":" << endl;
        cout << "Nome: ";
        cin >> nomes[i];
        cout << "Preco de compra: ";
        cin >> precosCompra[i];
        cout << "Preco de venda: ";
        cin >> precosVenda[i];
    }

    abaixo = 0;
    entre = 0;
    acima = 0;
    for (int i = 0; i < N; i++) {
        lucro = precosVenda[i] - precosCompra[i];
        percentualLucro = lucro * 100.0 / precosCompra[i];

        if (percentualLucro < 10.0) {
            abaixo++;
        } else if (percentualLucro < 20.0) {
            entre++;
        } else {
            acima++;
        }
    }

    totalCompra = 0;
    totalVenda = 0;
    for (int i = 0; i < N; i++) {
        totalCompra = totalCompra + precosCompra[i];
        totalVenda = totalVenda + precosVenda[i];
    }

    totalLucro = totalVenda - totalCompra;

    cout << endl << "RELATORIO:" << endl;
    cout << "Lucro abaixo de 10%: " << abaixo << endl;
    cout << "Lucro entre 10% e 20%: " << entre << endl;
    cout << "Lucro acima de 20%: " << acima << endl;
    cout << fixed << setprecision(2);
    cout << "Valor total de compra: " << totalCompra << endl;
    cout << "Valor total de venda: " << totalVenda << endl;
    cout << "Lucro total: " << totalLucro << endl;

    return 0;
}
