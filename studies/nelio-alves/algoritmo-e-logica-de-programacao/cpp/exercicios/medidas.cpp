#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double A, B, C, areaQuadrado, areaTriangulo, areaTrapezio;

    cout << "Digite a medida A: ";
    cin >> A;

    cout << "Digite a medida B: ";
    cin >> B;

    cout << "Digite a medida C: ";
    cin >> C;

    areaQuadrado = A * A;
    areaTriangulo = (A * B) / 2;
    areaTrapezio = ((A + B) * C) / 2;

    cout << fixed << setprecision(4);
    cout << "AREA DO QUADRADO = " << areaQuadrado << endl;
    cout << "AREA DO TRIANGULO = " << areaTriangulo << endl;
    cout << "AREA DO TRAPEZIO = " << areaTrapezio << endl;

	return 0;
}
