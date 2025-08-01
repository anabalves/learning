#include <stdio.h>

int main() {
    int numero;

    printf("Informe um numero: ");
    scanf("%d", &numero);

    if (numero % 2 == 0) {
        if (numero > 0) {
            printf("O numero %d eh par e positivo.", numero);
        } else {
            printf("O numero %d eh par e negativo.", numero);
        }
    } else {
        if (numero > 0) {
            printf("O numero %d eh impar e positivo.", numero);
        } else {
            printf("O numero %d eh impar e negativo.", numero);
        }
    }
}
