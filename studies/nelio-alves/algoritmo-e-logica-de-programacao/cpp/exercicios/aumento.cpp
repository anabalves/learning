#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double salarioAtual, novosalario, aumento;
    int porcentagem;

    cout << "Digite o salario da pessoa: ";
    cin >> salarioAtual;

    if (salarioAtual <= 1000.0){
        porcentagem = 20;
    } else if (salarioAtual <= 3000.0){
        porcentagem = 15;
    } else if (salarioAtual <= 8000.0){
        porcentagem = 10;
    } else {
        porcentagem = 5;
    }

    aumento = salarioAtual * porcentagem / 100;
    novosalario = salarioAtual + aumento;
    cout << fixed << setprecision(2);
    cout << "Novo salario = R$ " << novosalario << endl;
    cout << "Aumento = R$ " << aumento << endl;
    cout << "Porcentagem = " << porcentagem << " %" << endl;

	return 0;
}
