#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {
    double a, b, c, x1, x2, delta;

    cout << "Coeficiente a: ";
    cin >> a;

    cout << "Coeficiente b: ";
    cin >> b;

    cout << "Coeficiente c: ";
    cin >> c;

    delta = pow(b, 2) - 4 * a * c;

    if ((a == 0) || (delta < 0)) {
        cout << "Esta equacao nao possui raizes reais" << endl;
    } else {
        x1 = ((-b) + sqrt(delta)) / (2 * a);
        x2 = ((-b) - sqrt(delta)) / (2 * a);

        cout << fixed << setprecision(4);
        cout << "X1 = " << x1 << endl;
        cout << "X2 = " << x2 << endl;
    }

	return 0;
}
