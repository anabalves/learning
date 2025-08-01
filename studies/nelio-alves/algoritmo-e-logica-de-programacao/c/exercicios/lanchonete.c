#include <stdio.h>

int main() {
    int codigoProduto, quantidade;
    double valorPagamento;

    printf("Codigo do produto comprado: ");
    scanf("%d", &codigoProduto);

    printf("Quantidade comprada: ");
    scanf("%d", &quantidade);

    switch (codigoProduto) {
        case 1 :
            valorPagamento = quantidade * 5.00;
            break;

        case 2 :
            valorPagamento = quantidade * 3.50;
            break;

        case 3 :
            valorPagamento = quantidade * 4.80;
            break;

        case 4 :
            valorPagamento = quantidade * 8.90;
            break;

        case 5 :
            valorPagamento = quantidade * 7.32;
            break;
    }

    printf("Valor a pagar: R$ %.2lf\n", valorPagamento);

    return 0;
}
