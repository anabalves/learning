#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int N, cont;
    double soma, media, porcentagem;

    cout << "Quantas pessoas serao digitadas? ";
    cin >> N;

    string nomes[N];
    int idades[N];
    double alturas[N];

    for (int i = 0; i < N; i++) {
        cout << "Dados da " << i + 1 << "a pessoa:" << endl;
        cout << "Nome: ";
        cin >> nomes[i];
        cout << "Idade: ";
        cin >> idades[i];
        cout << "Altura: ";
        cin >> alturas[i];
    }

    cont = 0;
    soma = 0;
    for (int i = 0; i < N; i++) {
        if (idades[i] < 16) {
            cont++;
        }
        soma = soma + alturas[i];
    }

    media = soma / N;
    porcentagem = ((double) cont / N) * 100.0;

    cout << fixed << setprecision(2);
    cout << endl << "Altura media: " << media << endl;

    cout << fixed << setprecision(1);
    cout << "Pessoas com menos de 16 anos: " << porcentagem << "%" << endl;

    for (int i = 0; i < N; i++) {
        if (idades[i] < 16) {
            cout << nomes[i] << endl;;
        }
    }

    return 0;
}
