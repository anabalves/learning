#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {
    double area, raio;

    cout << "Digite o valor do raio do circulo: ";
    cin >> raio;

    area = M_PI * pow(raio, 2);

    cout << fixed << setprecision(3);
    cout << "AREA = " << area << endl;

	return 0;
}
