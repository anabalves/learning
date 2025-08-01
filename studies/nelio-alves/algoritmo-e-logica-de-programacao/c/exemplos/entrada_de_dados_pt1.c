#include <stdio.h>

int main() {

    int idade;
    double salario, altura;
    char nome[50];

    printf("Digite o valor da idade:");
    scanf("%d", &idade);

    printf("Digite o valor do salario:");
    scanf("%lf", &salario);

    printf("Digite o valor da altura:");
    scanf("%lf", &altura);

    printf("Digite o nome da pessoa:");
    scanf("%s", nome);

    printf("IDADE = %d\n", idade);
    printf("SALARIO = %.2lf\n", salario);
    printf("ALTURA = %.2lf\n", altura);
    printf("NOME = %s\n", nome);

    return 0;
}
