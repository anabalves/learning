#include <stdio.h>

int main() {
    double distDardo1, distDardo2, distDardo3, maior;

    printf("Digite as tres distancias:\n");
    scanf("%lf\n%lf\n%lf", &distDardo1, &distDardo2, &distDardo3);

    if ((distDardo1 > distDardo2) && (distDardo1 > distDardo3)) {
        maior = distDardo1;
    } else if (distDardo2 > distDardo3) {
        maior = distDardo2;
    } else {
        maior = distDardo3;
    }

    printf("MAIOR DISTANCIA = %.2lf\n", maior);

    return 0;
}
