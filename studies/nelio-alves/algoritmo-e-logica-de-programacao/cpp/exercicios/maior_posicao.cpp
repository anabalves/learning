#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int N, posicao;
    double maiorValor;

    cout << "Quantos numeros voce vai digitar? ";
    cin >> N;

    double vet[N];

    for (int i = 0; i < N; i++) {
        cout << "Digite um numero: ";
        cin >> vet[i];
    }

    posicao = 0;
    maiorValor = vet[0];

    for (int i = 1; i < N; i++) {
        if (vet[i] > maiorValor) {
            maiorValor = vet[i];
            posicao = i;
        }
    }

    cout << fixed << setprecision(1) << endl;
    cout << "MAIOR VALOR = " << maiorValor << endl;
    cout << "POSICAO DO MAIOR VALOR = " << posicao << endl;

    return 0;
}
