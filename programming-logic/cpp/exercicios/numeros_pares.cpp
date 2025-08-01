#include <iostream>

using namespace std;

int main() {
    int N, cont;

    cout << "Quantos numeros voce vai digitar? ";
    cin >> N;

    int vet[N];

    for (int i = 0; i < N; i++) {
        cout << "Digite um numero: ";
        cin >> vet[i];
    }

    cont = 0;
    cout << endl << "NUMEROS PARES:" << endl;
    for (int i = 0; i < N; i++) {
        if (vet[i] % 2 == 0) {
            cout << vet[i] << " ";
            cont++;
        }
    }

    cout << endl << endl << "QUANTIDADE DE PARES = " << cont << endl;

    return 0;
}
