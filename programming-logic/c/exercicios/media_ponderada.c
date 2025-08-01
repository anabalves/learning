#include <stdio.h>

int main() {
    int N;
    double a, b, c, media;

    printf("Quantos casos voce vai digitar? ");
    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        printf("Digite tres numeros:\n");
        scanf("%lf\n%lf\n%lf", &a, &b, &c);

        media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

        printf("MEDIA = %.1lf\n", media);
    }

    return 0;
}
