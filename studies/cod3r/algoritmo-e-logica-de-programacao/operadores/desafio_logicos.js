// Duas expressões resultar em TRUE (Aritméticos/Relacionais/Lógicos)
let verdadeiro1 = 1 != 2 && 5 < 11;
let verdadeiro2 = (4 !== 5) && 5 - 25 < 0;
let verdadeiro3 = 2 + 5 >= 7 || 8 > 2;
let verdadeiro4 = !(6 * 6 < 3);

console.log(verdadeiro1);
console.log(verdadeiro2);
console.log(verdadeiro3);
console.log(verdadeiro4);

// Duas expressões resultar em FALSE (Aritméticos/Relacionais/Lógicos)
let falso1 = 8 % 11 == 0 || "1" !== "1";
let falso2 = (1 !== "1") && (55 != 60 - 5);
let falso3 = 8 - 4 > 12 || false || 15 === '15';
let falso4 = !(7 !== 6 + 1 || '3' !== 3);

console.log(falso1);
console.log(falso2);
console.log(falso3);
console.log(falso4);