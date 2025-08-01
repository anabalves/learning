#include <stdio.h>

int main() {
	float valor_por_hora, salario;
	int horas_trabalhadas;

	printf("Qual valor você ganha por hora? ");
	scanf("%f", &valor_por_hora);

	printf("Quantas horas você trabalhou neste mes? ");
	scanf("%d", &horas_trabalhadas);

	salario = (horas_trabalhadas * valor_por_hora);

	printf("Neste mes você vai receber R$ %.2f", salario);
}
