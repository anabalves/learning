#include <stdio.h>

int main(){
    int quantMinutos, minutosExcedentes;
    double valorPagamento;

    printf("Digite a quantidade de minutos: ");
    scanf("%d", &quantMinutos);

    valorPagamento = 50.0;

    if (quantMinutos > 100) {
        minutosExcedentes = quantMinutos - 100;
        valorPagamento = valorPagamento + minutosExcedentes * 2.0;
    }

    printf("Valor a pagar: R$ %.2lf\n", valorPagamento);

    return 0;
}
