#include <stdio.h>

int main() {
    int N, soma, cont;
    double media;

    printf("Quantos elementos vai ter o vetor? ");
    scanf("%d", &N);

    int vet[N];

    for (int i = 0; i < N; i++) {
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }

    cont = 0;
    soma = 0;
    for (int i = 0; i < N; i++) {
        if (vet[i] % 2 == 0) {
            soma = soma + vet[i];
            cont++;
        }
    }

    if (cont == 0) {
        printf("NENHUM NUMERO PAR\n");
    } else {
        media = (double) soma / cont;

        printf("MEDIA DOS PARES = %.1lf\n", media);
    }

    return 0;
}
