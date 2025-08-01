#include <stdio.h>

int main() {
    int N, X, fora, dentro;
    fora = 0;
    dentro = 0;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        printf("Digite um numero: ");
        scanf("%d", &X);

        if ((X >= 10) && (X <= 20)) {
            dentro++;
        } else {
            fora++;
        }
    }

    printf("%d DENTRO\n", dentro);
    printf("%d FORA\n", fora);

    return 0;
}
