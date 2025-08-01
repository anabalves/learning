#include <stdio.h>

int main() {
    int numero, maior = 0;

    printf("Informe um numero: ");
    scanf("%d", &numero);

    while (numero != 0) {
        if (numero > maior) {
            maior = numero;
        }
        printf("Informe um numero: ");
        scanf("%d", &numero);
    }

    printf("O maior numero eh %d", maior);
}
