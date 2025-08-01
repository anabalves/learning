function semRetorno() {
    console.log('Função foi chamada!');
}

let a = 3;
let b = a * 7 + 10;
let c = semRetorno();
let d;
let e = a * 7 + semRetorno();

console.log(a, b, c, d, e);