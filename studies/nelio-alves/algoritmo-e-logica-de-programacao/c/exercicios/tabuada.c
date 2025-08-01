#include <stdio.h>

int main() {
    int N, produto;

    printf("Deseja a tabuada para qual valor?");
    scanf("%d", &N);

    for (int i = 1; i <= 10; i++) {
        produto = N * i;
        printf("%d * %d = %d\n", N, i, produto);
    }

    return 0;
}