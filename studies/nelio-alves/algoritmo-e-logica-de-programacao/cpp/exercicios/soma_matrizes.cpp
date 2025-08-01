#include <iostream>

using namespace std;

int main() {
    int M, N;

    cout << "Quantas linhas vai ter cada matriz? ";
    cin >> M;
    cout << "Quantas colunas vai ter cada matriz? ";
    cin >> N;

    int A[M][N], B[M][N], C[M][N];

    cout << "Digite os valores da matriz A:" << endl;
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            cout << "Elemento [" << i << "," << j << "]: ";
            cin >> A[i][j];
        }
    }

    cout << "Digite os valores da matriz B:" << endl;
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            cout << "Elemento [" << i << "," << j << "]: ";
            cin >> B[i][j];
        }
    }

    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }

    cout << endl << "MATRIZ A:" << endl;
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            cout << A[i][j] << " ";
        }
        cout << endl;
    }

    cout << endl << "MATRIZ B:" << endl;
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            cout << B[i][j] << " ";
        }
        cout << endl;
    }

    cout << endl << "MATRIZ SOMA:" << endl;
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            cout << C[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
