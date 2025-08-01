#include <iostream>

using namespace std;

int main() {
    int N, X, fora, dentro;
    fora = 0;
    dentro = 0;

    cout << "Quantos numeros voce vai digitar? ";
    cin >> N;

    for (int i = 0; i < N; i++) {
        cout << "Digite um numero: ";
        cin >> X;

        if ((X >= 10) && (X <= 20)) {
            dentro++;
        } else {
            fora++;
        }
    }

    cout << dentro << " DENTRO" << endl;
    cout << fora << " FORA" << endl;

    return 0;
}
