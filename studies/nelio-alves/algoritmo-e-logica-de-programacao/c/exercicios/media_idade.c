#include <stdio.h>

int main() {
    int idade, soma, cont;
    double media;
    soma = 0;
    cont = 0;

    printf("Digite as idades:\n");
    scanf("%d", &idade);

    if (idade < 0) {
        printf("IMPOSSIVEL CALCULAR");
    } else {

        while (idade >= 0) {
            soma = soma + idade;
            cont = cont + 1;

            scanf("%d", &idade);
        }

        media = (double) soma / cont;
        printf("MEDIA = %.2lf", media);
    }

    return 0;
}