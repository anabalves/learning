#include <iostream>

using namespace std;

int main() {
    int N, soma;

    cout << "Qual a ordem da matriz? ";
    cin >> N;

    int mat[N][N];

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cout << "Elemento [" << i << "," << j << "]: ";
            cin >> mat[i][j];
        }
    }

    cout << endl << "MATRIZ DIGITADA:" << endl;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cout << mat[i][j] << " ";
        }
        cout << endl;
    }

    soma = 0;
    for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
            soma = soma + mat[i][j];
        }
    }

    cout << endl << "SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " << soma << endl;

    return 0;
}
