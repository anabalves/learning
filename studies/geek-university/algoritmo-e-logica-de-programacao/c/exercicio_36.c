#include <stdio.h>

int main() {
    int vetor[10];
    char tem_maior_50 = 0;

    for (int i = 0; i < 10; i++) {
        printf("Informe o valor para o vetor %d/10: ", (i + 1));
        scanf("%d", &vetor[i]);
    }

    for (int i = 0; i < 10; i++) {
        if (vetor[i] > 50) {
            printf("O numero %d esta na posicao %d\n", vetor[i], i);
            tem_maior_50 = 1;
        }
    }

    if (tem_maior_50 < 1) {
        printf("Nao existe nenhum numero maior que 50.");
    }
}
