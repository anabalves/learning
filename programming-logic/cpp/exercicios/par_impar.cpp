#include <iostream>

using namespace std;

int main() {
    int N, num;

    cout << "Quantos numeros voce vai digitar? ";
    cin >> N;

    for (int i = 0; i < N; i++) {
        cout << "Digite um numero: ";
        cin >> num;

        if (num == 0) {
            cout << "NULO" << endl;
        } else {
            if (num % 2 == 0) {
                cout << "PAR";
            } else {
                cout << "IMPAR";
            }

            if (num > 0) {
                cout << " POSITIVO" << endl;
            } else {
                cout << " NEGATIVO" << endl;
            }
        }
    }

	return 0;
}
