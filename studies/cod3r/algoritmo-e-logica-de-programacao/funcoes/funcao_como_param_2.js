function executar(param, num1, num2) {
    if (typeof param === "function") {
        console.log(param(num1, num2));
    }
}

function somar(a = 0, b = 0) {
    return a + b;
}

function subtrair(a = 0, b = 0) {
    return a - b;
}

function multiplicar(a = 0, b = 0) {
    return a * b;
}

function dividir(a = 0, b = 0) {
    return a / b;
}

executar(somar, 50, 90);
executar(subtrair, 50, 90);
executar(multiplicar, 50, 90);
executar(dividir, 50, 90);