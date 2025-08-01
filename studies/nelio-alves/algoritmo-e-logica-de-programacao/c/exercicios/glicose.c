#include <stdio.h>

int main() {
    double medidaGlicose;

    printf("Digite a medida da glicose: ");
    scanf("%lf", &medidaGlicose);

    if (medidaGlicose <= 100) {
        printf("Classificacao: normal\n");
    }
    else if (medidaGlicose <= 140) {
        printf("Classificacao: elevado\n");
    } else {
        printf("Classificacao: diabetes\n");
    }

    return 0;
}
