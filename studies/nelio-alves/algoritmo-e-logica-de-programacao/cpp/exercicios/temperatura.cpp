#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    char escala;
    double tempFahrenheit, tempCelsius;

    cout << "Voce vai digitar a temperatura em qual escala (C/F)? ";
    cin >> escala;

    cout << fixed << setprecision(2);

    if ((escala == 'F') || (escala == 'f')) {
        cout << "Digite a temperatura em Fahrenheit: ";
        cin >> tempFahrenheit;

        tempCelsius = 5.0 / 9.0 * (tempFahrenheit - 32.0);
        cout << "Temperatura equivalente em Celsius: " << tempCelsius << endl;
    } else if ((escala == 'C') || (escala == 'c')) {
        cout << "Digite a temperatura em Celsius: ";
        cin >> tempCelsius;

        tempFahrenheit = tempCelsius * 9.0 / 5.0 + 32.0;
        cout << "Temperatura equivalente em Fahrenheit: " << tempFahrenheit << endl;
    } else {
        cout << "Escala invalida!";
    }

	return 0;
}
