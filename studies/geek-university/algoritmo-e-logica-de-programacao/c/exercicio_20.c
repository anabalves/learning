#include <stdio.h>

int main() {
    int c;
    float n, e = 0, salario, valor_hora = 10.00;

    printf("Informe o codigo: ");
    scanf("%d", &c);
    printf("Informe a quantidade de horas trabalhadas: ");
    scanf("%f", &n);

    if (n > 50) {
        e = (n - 50) * 20.00;
        salario = (50 * valor_hora) + e;

        printf("Salario Total R$ %.2f\n", salario);
        printf("Salario excedente R$ %.2f", e);
    } else {
        salario = n * valor_hora;

        printf("Salario Total R$ %.2f\n", salario);
        printf("Salario excedente: R$ %.2f", e);
    }
}
