#include <stdio.h>

int main(){
    char escala;
    double tempFahrenheit, tempCelsius;

    printf("Voce vai digitar a temperatura em qual escala (C/F)? ");
    scanf("%c", &escala);

    if ((escala == 'F') || (escala == 'f')) {
        printf("Digite a temperatura em Fahrenheit: ");
        scanf("%lf", &tempFahrenheit);

        tempCelsius = 5.0 / 9.0 * (tempFahrenheit - 32.0);
        printf("Temperatura equivalente em Celsius: %.2lf\n", tempCelsius);
    } else if ((escala == 'C') || (escala == 'c')) {
        printf("Digite a temperatura em Celsius: ");
        scanf("%lf", &tempCelsius);

        tempFahrenheit = tempCelsius * 9.0 / 5.0 + 32.0;
        printf("Temperatura equivalente em Fahrenheit: %.2lf\n", tempFahrenheit);
    } else {
        printf("Escala invalida!");
    }

    return 0;
}
