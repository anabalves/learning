#include <stdio.h>

int main() {
    float indice;

    printf("Informe o indice de poluicao: ");
    scanf("%f", &indice);

    if (indice >= 0.3 && indice < 0.4) {
        printf("As empresas do 1 grupo devem parar as atividades.");
    } else if (indice >= 0.4 && indice < 0.5) {
        printf("As empresas do 1 e 2 grupos devem parar as atividades.");
    } else if (indice >= 0.5) {
        printf("Todas as empresas devem parar suas atividades.");
    } else {
        printf("Niveis aceitaveis.");
    }
}
