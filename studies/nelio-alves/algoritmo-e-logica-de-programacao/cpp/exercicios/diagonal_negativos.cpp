#include <iostream>

using namespace std;

int main() {
    int N, cont;

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

    cout << endl << "DIAGONAL PRINCIPAL:" << endl;
    for (int i = 0; i < N; i++) {
        cout << mat[i][i] << " ";
    }

    cont = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            if (mat[i][j] < 0) {
                cont++;
            }
        }
    }

    if (cont == 0) {
        cout << endl << endl << "Nao ha negativos na matriz" << endl;
    } else {
        cout << endl << "QUANTIDADE DE NEGATIVOS = " << cont << endl;
    }

    return 0;
}
