console.log(typeof console); // object
console.log(typeof console.log); // function

const numeros = [1, 2, 3];

console.log(typeof numeros); // object

numeros.push(4);
numeros.push(5);
numeros.push(10.98);

console.log(numeros); // [ 1, 2, 3, 4, 5, 10.98 ]
console.log(numeros.length);