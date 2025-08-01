#include <stdio.h>

int main() {
	int codigo, quantidade;
	float valor, total;

	printf("Informe o codigo da peca: ");
	scanf("%d", &codigo);

	printf("Informe o valor da peca: ");
	scanf("%d", &valor);

    printf("Informe a quantidade de pecas: ");
    scanf("%d", &quantidade);

    total = quantidade * valor;

    printf("Codigo da peca: %d", codigo);
	printf("Valor total: %.2f", total);
}
