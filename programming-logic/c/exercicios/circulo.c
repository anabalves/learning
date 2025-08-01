#include <stdio.h>
#include <math.h>

int main() {
    double area, raio;

    printf("Digite o valor do raio do circulo: ");
    scanf("%lf", &raio);

    area = M_PI * pow(raio, 2);

    printf("AREA = %.3lf\n", area);

    return 0;
}
