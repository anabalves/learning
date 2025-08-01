#include <stdio.h>

int main() {
    int X, Y, troca, soma;

    printf("Digite dois numeros:\n");
    scanf("%d\n%d", &X, &Y);

    if (X > Y) {
        troca = X;
        X = Y;
        Y = troca;
    }

    soma = 0;
    for (int i = X + 1; i <= Y - 1; i++) {

        if (i % 2 != 0) {
            soma = soma + i;
        }

    }

    printf("SOMA DOS IMPARES = %d\n", soma);

    return 0;
}
