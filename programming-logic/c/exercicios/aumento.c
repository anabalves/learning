#include <stdio.h>

int main() {
    double salarioAtual, novosalario, aumento;
    int porcentagem;

    printf("Digite o salario da pessoa: ");
    scanf("%lf", &salarioAtual);

    if (salarioAtual <= 1000.0) {
        porcentagem = 20;
    } else if (salarioAtual <= 3000.0) {
        porcentagem = 15;
    } else if (salarioAtual <= 8000.0) {
        porcentagem = 10;
    } else {
        porcentagem = 5;
    }

    aumento = salarioAtual * porcentagem / 100;
    novosalario = salarioAtual + aumento;
    printf("Novo salario = R$ %.2lf\n", novosalario);
    printf("Aumento = R$ %.2lf\n", aumento);
    printf("Porcentagem = %d %%\n", porcentagem);

    return 0;
}
