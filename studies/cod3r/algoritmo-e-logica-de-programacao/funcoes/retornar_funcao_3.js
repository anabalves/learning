function somar1(a = 0, b = 0) {
    return a + b;
}

console.log(somar1(5, 4));

function somar2(a = 0) {
    return function (b = 0) {
        return a + b;
    }
}

console.log(somar2(5)(4));

const somarMais10 = somar2(10);

console.log(somarMais10(5));