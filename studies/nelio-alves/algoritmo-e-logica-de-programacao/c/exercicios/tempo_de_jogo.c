#include <stdio.h>

int main() {
    int horaInicial, horaFinal, duracao;

    printf("Hora inicial: ");
    scanf("%d", &horaInicial);

    printf("Hora final: ");
    scanf("%d", &horaFinal);

    if (horaInicial < horaFinal) {
        duracao = horaFinal - horaInicial;
    } else {
        duracao = 24 - (horaInicial - horaFinal);
    }

    printf("O JOGO DUROU %d HORA(S)\n", duracao);

    return 0;
}
