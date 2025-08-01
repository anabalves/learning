#include <stdio.h>

int main() {

    int a, b;
    a = 5;
    b = 2 * a;
    printf("%d\n", a);
    printf("%d\n", b);

    int c;
    double d;
    c = 5;
    d = 2 * c;
    printf("%d\n", c);
    printf("%.1lf\n", d);

    double b1, b2, h, area;
    b1 = 6.0;
    b2 = 8.0;
    h = 5.0;
    area = (b1 + b2) / 2.0 * h;
    printf("%lf\n", area);

    int e, f, resultado;
    e = 5;
    f = 2;
    resultado = e / f;
    printf("%d\n", resultado);

    double i;
    int j;
    i = 5.0;
    j = (int) i;
    printf("%d\n", j);

}
