#include <iostream>

using namespace std;

int main() {
    double x, y;

    cout << "Valor de X: ";
    cin >> x;

    cout << "Valor de Y: ";
    cin >> y;

    if ((x > 0) && (y > 0)) {
        cout << "Q1" << endl;
    }  else if ((x < 0) && (y > 0)) {
        cout << "Q2" << endl;
    } else if ((x < 0) && (y < 0)) {
        cout << "Q3" << endl;
    } else if ((x > 0) && (y < 0)) {
        cout << "Q4" << endl;
    } else if ((x == 0) && (y == 0)) {
        cout << "Origem" << endl;
    } else if (x == 0) {
        cout << "Eixo Y" << endl;
    } else {
        cout << "Eixo X" << endl;
    }

	return 0;
}
