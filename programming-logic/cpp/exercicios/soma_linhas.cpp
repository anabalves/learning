#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int M, N;

    cout << "Qual a quantidade de linhas da matriz? ";
    cin >> M;
    cout << "Qual a quantidade de colunas da matriz? ";
    cin >> N;

    double mat[M][N], vet[M];

    for (int i = 0; i < M; i++) {
        cout << "Digite os elementos da " << i + 1 << "a. linha:" << endl;

        for (int j = 0; j < N; j++) {
            cin >> mat[i][j];
        }
    }

    for (int i = 0; i < M; i++) {
        vet[i] = 0;

        for (int j = 0; j < N; j++) {
            vet[i] = vet[i] + mat[i][j];
        }
    }

    cout << fixed << setprecision(2);

    cout << endl << "MATRIZ DIGITADA:" << endl;
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            cout << mat[i][j] << " ";
        }
        cout << endl;
    }

    cout << endl << "VETOR GERADO:" << endl;
    for (int i = 0; i < M; i++) {
        cout << vet[i] << endl;
    }

    return 0;
}
