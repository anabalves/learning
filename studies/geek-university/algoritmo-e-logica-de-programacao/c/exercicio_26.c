#include <stdio.h>

int main() {
    for (int i = 1; i <= 100; i++) {
        if (i % 10 == 0) {
            printf("%d eh multiplo de 10\n", i);
        }
    }
}
