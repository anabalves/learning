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
    char nomePrimeiraPessoa[50], nomeSegundaPessoa[50];
    int idadePrimeiraPessoa, idadeSegundaPessoa;
    double idadeMedia;

    printf("Dados da primeira pessoa:\n");

    printf("Nome:");
    ler_texto(nomePrimeiraPessoa, 50);

    printf("Idade:");
    scanf("%d", &idadePrimeiraPessoa);

    printf("Dados da segunda pessoa:\n");

    printf("Nome:");
    limpar_entrada();
    ler_texto(nomeSegundaPessoa, 50);

    printf("Idade:");
    scanf("%d", &idadeSegundaPessoa);

    idadeMedia = (idadePrimeiraPessoa +  idadeSegundaPessoa) / 2.0;

    printf("A idade media de %s e %s eh de %.1lf anos", nomePrimeiraPessoa, nomeSegundaPessoa, idadeMedia);

    return 0;
}
