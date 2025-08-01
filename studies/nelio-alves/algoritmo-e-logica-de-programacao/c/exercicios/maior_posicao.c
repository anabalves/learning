#include <stdio.h>

int main() {
    int N, posicao;
    double maiorValor;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &N);

    double vet[N];

    for (int i = 0; i < N; i++) {
        printf("Digite um numero: ");
        scanf("%lf", &vet[i]);
    }

    posicao = 0;
    maiorValor = vet[0];

    for (int i = 1; i < N; i++) {
        if (vet[i] > maiorValor) {
            maiorValor = vet[i];
            posicao = i;
        }
    }

    printf("\nMAIOR VALOR = %.1lf\n", maiorValor);
    printf("POSICAO DO MAIOR VALOR = %d\n", posicao);

    return 0;
}
