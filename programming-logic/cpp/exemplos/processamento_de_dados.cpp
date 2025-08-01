#include <iostream>
#include <iomanip>

using namespace std;

int main() {

    int a, b;
    a = 5;
    b = 2 * a;
    cout << a << endl;
    cout << b << endl;

    int c;
    double d;
    c = 5;
    d = 2 * c;
    cout << c << endl;
    cout << fixed << setprecision(1) << d << endl;

    double b1, b2, h, area;
    b1 = 6.0;
    b2 = 8.0;
    h = 5.0;
    area = (b1 + b2) / 2.0 * h;
    cout << area << endl;

    int e, f, resultado;
    e = 5;
    f = 2;
    resultado = e / f;
    cout << resultado << endl;

    double i;
    int j;
    i = 5.0;
    j = (int) i;
    cout << j << endl;

    return 0;
}
