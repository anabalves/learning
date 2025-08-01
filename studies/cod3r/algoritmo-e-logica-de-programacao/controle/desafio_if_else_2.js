//Conceito || Faixa de nota corresponde 
//    A    || Entre 9.0 e 10.00
//    B    || Entre 7.0 e 8.9
//    C    || Entre 5.0 e 6.9
//    D    || Entre 4.5 e 4.9
//    F    || Abaixo de 4.5
const nota = 10;

if (nota <= 10 && nota >= 9) {
    console.log('A');
} else if (nota < 9 && nota >= 7) {
    console.log('B');
} else if (nota < 7 && nota >= 5) {
    console.log('C');
} else if (nota < 5 && nota >= 4.5) {
    console.log('D');
} else if (nota < 4.5 && nota >= 0) {
    console.log('F');
} else {
    console.log('Nota inválida!');
}