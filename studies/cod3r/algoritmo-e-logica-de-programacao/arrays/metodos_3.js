const numeros = [1, 2, 3, 4, 5, 6];

// for (let i = 0; i < numeros.length; i++) {
//     console.log(numeros[i]);
// }

// for (let n of numeros) {
//     console.log(n);
// }

// numeros.forEach(function(elemento, indice, array) {
//     console.log(elemento, indice, array);
// });

// numeros.forEach(function(_, indice) {
//     console.log(indice);
// });

function praCadaElemento(elemento, indice, array) {
    console.log(elemento, indice, array);
}

numeros.forEach(praCadaElemento);