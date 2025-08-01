#include <stdio.h>

int main() {
    int numero, a, b;

    printf("Informe um numero: ");
    scanf("%d", &numero);

    if (numero == 0) {
        printf("O valor %d eh neutro.", numero);
    } else if (numero > 0) {
        a = numero;
        printf("O valor %d eh positivo.", a);
    } else {
        b = numero;
        printf("O valor %d eh negativo.", b);
    }
}
