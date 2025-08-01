#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double distDardo1, distDardo2, distDardo3, maior;

    cout << "Digite as tres distancias:" << endl;
    cin >> distDardo1 >> distDardo2 >> distDardo3;

    if ((distDardo1 > distDardo2) && (distDardo1 > distDardo3)) {
        maior = distDardo1;
    } else if (distDardo2 > distDardo3) {
        maior = distDardo2;
    } else {
        maior = distDardo3;
    }

    cout << fixed << setprecision(2);
    cout << "MAIOR DISTANCIA = " << maior << endl;

	return 0;
}
