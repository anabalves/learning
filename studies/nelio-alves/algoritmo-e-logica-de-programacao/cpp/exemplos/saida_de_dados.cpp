#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

int main() {

    cout << "Bom dia";
    cout << "Boa noite";

    cout << "Bom dia" << endl;
    cout << "Boa noite" << endl;

    int x, y;
    x = 10;
    y = 20;
    cout << x << endl;
    cout << y << endl;

    double z;
    z = 2.3456;
    cout << fixed << setprecision(2) << z << endl;

    int idade;
    double salario;
    string nome;
    char sexo;

    idade = 32;
    salario = 4560.9;
    nome = "Maria Silva";
    sexo = 'F';

    cout << fixed << setprecision(2);
    cout << "A funcionaria " << nome << ", sexo " << sexo <<
    ", ganha " << salario << " e tem " << idade << " anos" << endl;

    return 0;
}
