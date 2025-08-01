#include <stdio.h>

int main(){
    double precoUnitario, dinheiro, troco, valorRestante, total;
    int quantComprada;

    printf("Preco unitario do produto: ");
    scanf("%lf", &precoUnitario);

    printf("Quantidade comprada: ");
    scanf("%d", &quantComprada);

    printf("Dinheiro recebido: ");
    scanf("%lf", &dinheiro);

    total = precoUnitario * quantComprada;

    if (dinheiro > total) {
        troco = dinheiro - total;
        printf("TROCO = %.2lf\n", troco);
    }
    else {
        valorRestante = total - dinheiro;
        printf("DINHEIRO INSUFICIENTE. FALTAM %.2lf REAIS\n", valorRestante);
    }

    return 0;
}
