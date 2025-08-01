#include <stdio.h>
#include <string.h>

void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

void ler_texto(char *buffer, int length) {
    fgets(buffer, length, stdin);
    strtok(buffer, "\n");
}

int main() {
    int N, cont;
    double soma, media, porcentagem;

    printf("Quantas pessoas serao digitadas?");
    scanf("%d", &N);

    char nomes[N][50];
    int idades[N];
    double alturas[N];

    for (int i = 0; i < N; i++) {
        printf("Dados da %da pessoa:\n", i + 1);
        printf("Nome:");
        limpar_entrada();
        ler_texto(nomes[i], 50);
        printf("Idade:");
        scanf("%d", &idades[i]);
        printf("Altura:");
        scanf("%lf", &alturas[i]);
    }

    cont = 0;
    soma = 0;
    for (int i = 0; i < N; i++) {
        if (idades[i] < 16) {
            cont++;
        }
        soma = soma + alturas[i];
    }

    media = soma / N;
    porcentagem = ((double) cont / N) * 100.0;

    printf("\nAltura media = %.2lf\n", media);
    printf("Pessoas com menos de 16 anos: %.1lf%%\n", porcentagem);

    for (int i = 0; i < N; i++) {
        if (idades[i] < 16) {
            printf("%s\n", nomes[i]);
        }
    }

    return 0;
}
