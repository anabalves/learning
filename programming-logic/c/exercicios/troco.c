#include <stdio.h>

int main(){
    double precoUnitario, dinheiroRecebido, troco;
    int qtd;

    printf("Preco unitario do produto: ");
    scanf("%lf", &precoUnitario);

    printf("Quantidade comprada: ");
    scanf("%d", &qtd);

    printf("Dinheiro recebido: ");
    scanf("%lf", &dinheiroRecebido);

    troco = dinheiroRecebido - (precoUnitario * qtd);

    printf("TROCO = %.2lf\n", troco);

    return 0;
}
