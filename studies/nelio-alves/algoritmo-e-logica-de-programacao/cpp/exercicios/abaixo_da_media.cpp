#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int N;
    double media, soma;

    cout << "Quantos elementos vai ter o vetor? ";
    cin >> N;

    double vet[N];

    for (int i = 0; i < N; i++) {
        cout << "Digite um numero: ";
        cin >> vet[i];
    }

    soma = 0;
    for (int i = 0; i < N; i++) {
        soma = soma + vet[i];
    }

    cout << fixed << setprecision(3);

    media = soma / N;
    cout << endl << "MEDIA DO VETOR = " << media << endl;

    cout << fixed << setprecision(1);

    cout << "ELEMENTOS ABAIXO DA MEDIA:" << endl;
    for (int i = 0; i < N; i++) {
        if (vet[i] < media) {
            cout << vet[i] << endl;
        }
    }

    return 0;
}
