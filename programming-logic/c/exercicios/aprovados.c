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
    int N;
    double media;

    printf("Quantos alunos serao digitados? ");
    scanf("%d", &N);

    char nomes[N][50];
    double notasPrimeiroSemestre[N], notasSegundoSemestre[N];

    for (int i = 0; i < N; i++) {
        printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
        limpar_entrada();
        ler_texto(nomes[i], 50);
        scanf("%lf %lf", &notasPrimeiroSemestre[i], &notasSegundoSemestre[i]);
    }

    printf("Alunos aprovados:\n");
    for (int i = 0; i < N; i++) {
        media = (notasPrimeiroSemestre[i] + notasSegundoSemestre[i]) / 2;

        if (media >= 6.0) {
            printf("%s\n", nomes[i]);
        }
    }

    return 0;
}
