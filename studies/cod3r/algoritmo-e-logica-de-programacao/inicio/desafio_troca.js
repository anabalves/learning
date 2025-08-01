let a = 7;
let b = 94;
console.log("Antes:");
console.log(a);
console.log(b);

// depois da troca ... a = 94 e b = 7
// let c = a; // c = 7
// a = b; // a = 94
// b = c; // b = 7
[a, b]=[b, a];
console.log("Depois:");
console.log(a);
console.log(b);