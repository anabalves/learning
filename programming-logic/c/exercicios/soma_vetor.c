#include <stdio.h>

int main() {
    double vet[10], soma, media;
    int N;

    printf("Quantos numeros voce vai digitar?");
    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        printf("Digite um numero:");
        scanf("%lf", &vet[i]);
    }

    printf("\nVALORES = ");
    for (int i = 0; i < N; i++) {
        printf("%.1lf ", vet[i]);
    }

    soma = 0;
    for (int i = 0; i < N; i++) {
        soma = soma + vet[i];
    }

    printf("\nSOMA = %.2lf", soma);
    media = soma / N;
    printf("\nMEDIA = %.2lf", media);

    return 0;
}
