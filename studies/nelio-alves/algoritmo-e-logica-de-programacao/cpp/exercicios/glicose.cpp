#include <iostream>

using namespace std;

int main() {
    double medidaGlicose;

    cout << "Digite a medida da glicose: ";
    cin >> medidaGlicose;

    if (medidaGlicose <= 100) {
        cout << "Classificacao: normal" << endl;
    } else if (medidaGlicose <= 140) {
        cout << "Classificacao: elevado" << endl;
    } else{
        cout << "Classificacao: diabetes" << endl;
    }

	return 0;
}
