#include <stdio.h>

int main() {
    int num1, num2, num3, menor;

    printf("Primeiro valor:");
    scanf("%d", &num1);

    printf("Segundo valor:");
    scanf("%d", &num2);

    printf("Terceiro valor:");
    scanf("%d", &num3);

    if ((num1 < num2) && (num1 < num3)) {
        menor = num1;
    } else if (num2 < num3) {
        menor = num2;
    } else {
        menor = num3;
    }

    printf("MENOR = %d", menor);

    return 0;
}
