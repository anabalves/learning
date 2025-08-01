#include <iostream>

using namespace std;

int main() {
    int N, posicao, maiorIdade;

    cout << "Quantas pessoas voce vai digitar? ";
    cin >> N;

    string nomes[N];
    int idades[N];

    for (int i = 0; i < N; i++) {
        cout << "Dados da " << i + 1 << "a pessoa:" << endl;
        cout << "Nome: ";
        cin >> nomes[i];
        cout << "Idade: ";
        cin >> idades[i];
    }

    posicao = 0;
    maiorIdade = idades[0];

    for (int i = 1; i < N; i++) {
        if (idades[i] > maiorIdade) {
            maiorIdade = idades[i];
            posicao = i;
        }
    }

    cout << "PESSOA MAIS VELHA: " << nomes[posicao] << endl;

    return 0;
}
