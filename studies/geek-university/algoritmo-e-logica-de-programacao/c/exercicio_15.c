#include <stdio.h>

int main() {
    int numero;

    printf("Informe um numero: ");
    scanf("%d", &numero);

    if (numero > 100) {
        printf("%d", numero);
    } else {
        numero = 0;
        printf("%d", numero);
    }
}
