#include <stdio.h>

int main() {
    int N, contMulheres, contHomens;
    double somaAlturaMulheres, mediaAlturaMulheres, menorAltura, maiorAltura;

    printf("Quantas pessoas serao digitadas? ");
    scanf("%d", &N);

    double alturas[N];
    char generos[N];

    for (int i = 0; i < N; i++) {
        printf("Altura da %da pessoa: ", i + 1);
        scanf("%lf", &alturas[i]);
        printf("Genero da %da pessoa: ", i + 1);
        scanf(" %c", &generos[i]);
    }

    menorAltura = alturas[0];
    maiorAltura = alturas[0];
    for (int i = 1; i < N; i++) {
        if (alturas[i] > maiorAltura) {
            maiorAltura = alturas[i];
        }
        if (alturas[i] < menorAltura) {
            menorAltura = alturas[i];
        }
    }

    printf("Menor altura = %.2lf\n", menorAltura);
    printf("Maior altura = %.2lf\n", maiorAltura);

    contHomens = 0;
    contMulheres = 0;
    somaAlturaMulheres = 0;
    for (int i = 0; i < N; i++) {
        if ((generos[i]=='F') || (generos[i]=='f')) {
            contMulheres++;
            somaAlturaMulheres = somaAlturaMulheres + alturas[i];
        }
    }

    if (contMulheres == 0) {
        printf("Impossivel calcular a altura media das mulheres");
    } else {
        mediaAlturaMulheres = somaAlturaMulheres / contMulheres;
        printf("Media das alturas das mulheres = %.2lf\n", mediaAlturaMulheres);
    }

    contHomens = N - contMulheres;
    printf("Numero de homens = %d\n", contHomens);

    return 0;
}
