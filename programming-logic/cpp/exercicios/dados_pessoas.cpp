#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int N, contMulheres, contHomens;
    double somaAlturaMulheres, mediaAlturaMulheres, menorAltura, maiorAltura;

    cout << "Quantas pessoas serao digitadas? ";
    cin >> N;

    double alturas[N];
    char generos[N];

    for (int i = 0; i < N; i++) {
        cout << "Altura da " << i + 1 << "a pessoa: ";
        cin >> alturas[i];
        cout << "Genero da " << i + 1 << "a pessoa: ";
        cin >> generos[i];
    }

    menorAltura = alturas[0];
    maiorAltura = alturas[0];
    for (int i = 1; i < N; i++) {
        if (alturas[i] > maiorAltura) {
            maiorAltura = alturas[i];
        }
        if (alturas[i] < menorAltura) {
            menorAltura = alturas[i];
        }
    }

    cout << fixed << setprecision(2);

    cout << "Menor altura = " << menorAltura << endl;
    cout << "Maior altura = " << maiorAltura << endl;

    contHomens = 0;
    contMulheres = 0;
    somaAlturaMulheres = 0;
    for (int i = 0; i < N; i++) {
        if ((generos[i]=='F') || (generos[i]=='f')) {
            contMulheres++;
            somaAlturaMulheres = somaAlturaMulheres + alturas[i];
        }
    }

    if (contMulheres == 0) {
        cout << "Impossivel calcular a altura media das mulheres" << endl;
    } else {
        mediaAlturaMulheres = somaAlturaMulheres / contMulheres;
        cout << "Media das alturas das mulheres = " << mediaAlturaMulheres << endl;
    }

    contHomens = N - contMulheres;
    cout << "Numero de homens = " << contHomens << endl;

    return 0;
}
