#include<iostream>

using namespace std;

int main() {
    int N, maior;

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

    cout << endl << "MAIOR ELEMENTO DE CADA LINHA:" << endl;
    for (int i = 0; i < N; i++) {
        maior = mat[i][0];
        for (int j = 0; j < N; j++) {
            if (maior < mat[i][j]) {
                maior = mat[i][j];
            }
        }
        cout << maior << endl;
    }

    return 0;
}
