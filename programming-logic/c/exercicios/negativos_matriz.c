#include <stdio.h>

int main() {
    int M, N;

    printf("Qual a quantidade de linhas da matriz? ");
    scanf("%d", &M);
    printf("Qual a quantidade de colunas da matriz? ");
    scanf("%d", &N);

    int mat[M][N];

    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &mat[i][j]);
        }
    }

    printf("VALORES NEGATIVOS:\n");
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            if (mat[i][j] < 0) {
                printf("%d\n", mat[i][j]);
            }
        }
    }

    return 0;
}
