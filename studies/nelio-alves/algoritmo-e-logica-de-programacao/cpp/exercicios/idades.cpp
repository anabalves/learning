#include <iostream>
#include <iomanip>
#include <string>
#include <climits>

using namespace std;

int main() {
    string nomePrimeiraPessoa, nomeSegundaPessoa;
    int idadePrimeiraPessoa, idadeSegundaPessoa;
    double idadeMedia;

    cout << "Dados da primeira pessoa:" << endl;

    cout << "Nome: ";
    getline(cin, nomePrimeiraPessoa);

    cout << "Idade: ";
    cin >> idadePrimeiraPessoa;

    cout << "Dados da segunda pessoa:" << endl;

    cout << "Nome: ";
    cin.ignore(INT_MAX, '\n');
    getline(cin, nomeSegundaPessoa);

    cout << "Idade: ";
    cin >> idadeSegundaPessoa;

    idadeMedia = (double)(idadePrimeiraPessoa + idadeSegundaPessoa) / 2;

    cout << fixed << setprecision(1);
    cout << "A idade media de " << nomePrimeiraPessoa << " e " << nomeSegundaPessoa << " eh de " << idadeMedia << " anos" << endl;

	return 0;
}
