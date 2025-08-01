#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int idade, soma, cont;
    double media;
    soma = 0;
    cont = 0;

    cout << "Digite as idades:" << endl;
    cin >> idade;

    if (idade < 0) {
        cout << "IMPOSSIVEL CALCULAR" << endl;
    } else {
        while (idade >= 0) {
            soma = soma + idade;
            cont++;

            cin >> idade;
        }

        media = (double) soma / cont;

        cout << fixed << setprecision(2);
        cout << "MEDIA = " << media << endl;
    }

	return 0;
}
