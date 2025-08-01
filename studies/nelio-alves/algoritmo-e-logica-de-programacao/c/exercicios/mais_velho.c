#include <stdio.h>

int main() {
    int N, posicao, maiorIdade;

    printf("Quantas pessoas voce vai digitar? ");
    scanf("%d", &N);

    char nomes[N][50];
    int idades[N];

    for (int i = 0; i < N; i++) {
        printf("Dados da %da pessoa:\n", i + 1);
        printf("Nome: ");
        scanf("%s", &nomes[i][0]);
        printf("Idade: ");
        scanf("%d", &idades[i]);
    }

    posicao = 0;
    maiorIdade = idades[0];

    for (int i = 1; i < N; i++) {
        if (idades[i] > maiorIdade) {
            maiorIdade = idades[i];
            posicao = i;
        }
    }

    printf("PESSOA MAIS VELHA: %s\n", nomes[posicao]);

    return 0;
}
