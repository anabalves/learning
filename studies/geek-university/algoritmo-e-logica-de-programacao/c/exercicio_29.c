#include <stdio.h>
#include <string.h>

int main() {
    char nome_usuario[100], senha[100];

    printf("Informe o nome de usuario: ");
    gets(nome_usuario);
    printf("Informe a senha: ");
    gets(senha);

    while (!strcmp(nome_usuario, senha)) {
        printf("Nome de usuario e senha devem ser diferentes.\n");
        printf("Informe o nome de usuario: ");
        gets(nome_usuario);
        printf("Informe a senha: ");
        gets(senha);
    }
}
