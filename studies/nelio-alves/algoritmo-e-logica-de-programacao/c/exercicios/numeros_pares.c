#include <stdio.h>

int main(){
    int N, cont;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &N);

    int vet[N];

    for (int i = 0; i < N; i++) {
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }

    cont = 0;
    printf("\nNUMEROS PARES:\n");
    for (int i = 0; i < N; i++) {
        if (vet[i] % 2 == 0) {
            printf("%d  ", vet[i]);
            cont++;
        }
    }

    printf("\n\nQUANTIDADE DE PARES = %d\n", cont);

    return 0;
}
