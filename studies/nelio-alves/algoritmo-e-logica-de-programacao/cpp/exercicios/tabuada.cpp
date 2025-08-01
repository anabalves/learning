#include <iostream>

using namespace std;

int main() {
    int N, produto;

    cout << "Deseja a tabuada para qual valor? ";
    cin >> N;

    for (int i = 1; i <= 10; i++) {
        produto = N * i;
        cout << N << " x " << i << " = " << produto << endl;
    }

    return 0;
}
