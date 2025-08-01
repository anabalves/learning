#include <stdio.h>

int main() {
    int N, vet[N];

    printf("Quantos numeros voce vai digitar?");
    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        printf("Digite um numero:");
        scanf("%d", &vet[i]);
    }

    printf("\nNUMEROS NEGATIVOS:\n");
    for (int i = 0; i < N; i++) {
        if (vet[i] < 0) {
            printf("%d\n", vet[i]);
        }
    }

    return 0;
}