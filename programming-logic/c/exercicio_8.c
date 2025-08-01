#include <stdio.h>

int main() {
	int num1, num2, soma;

	printf("Informe o primeiro numero: ");
	scanf("%d", &num1);
	printf("Informe o segundo numero: ");
	scanf("%d", &num2);

	soma = (num1 + num2);

	printf("A soma de %d com %d eh igual a ", num1, num2, soma);
}
