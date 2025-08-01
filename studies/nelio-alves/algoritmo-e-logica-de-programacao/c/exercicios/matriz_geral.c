#include <stdio.h>
#include <math.h>

int main(){
    int N, linha, coluna;
    double somaPositivos;

    printf("Qual a ordem da matriz? ");
    scanf("%d", &N);

    double mat[N][N];

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%lf", &mat[i][j]);
        }
    }

    printf("\nMATRIZ DIGITADA:\n");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            printf("%.1lf ", mat[i][j]);
        }
        printf("\n");
    }

    somaPositivos = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            if (mat[i][j] > 0) {
                somaPositivos = somaPositivos + mat[i][j];
            }
        }
    }

    printf("\nSOMA DOS POSITIVOS: %.1lf\n", somaPositivos);

    printf("\nEscolha uma linha: ");
    scanf("%d", &linha);

    printf("LINHA ESCOLHIDA: ");
    for (int i = 0; i < N; i++) {
        printf("%.1lf ", mat[linha][i]);
    }

    printf("\n\nEscolha uma coluna: ");
    scanf("%d", &coluna);

    printf("COLUNA ESCOLHIDA: ");
    for (int i = 0; i < N; i++) {
        printf("%.1lf ", mat[i][coluna]);
    }

    printf("\n\nDIAGONAL PRINCIPAL: ");
    for (int i = 0; i < N; i++) {
        printf("%.1lf ", mat[i][i]);
    }

    for (int i = 0; i < N; i++) {
        for (int j=0; j<N; j++) {
            if (mat[i][j] < 0) {
                mat[i][j] = pow(mat[i][j], 2);
            }
        }
    }

    printf("\n\nMATRIZ ALTERADA:\n");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            printf("%.1lf ", mat[i][j]);
        }
        printf("\n");
    }

    return 0;
}
