// break
for (let i = 1; i <= 5; i++) {
    if (i === 3) {
        break;
        //break interrompe o for e vai para o proxima linha depois do for
    }
    console.log(i);
}

//continue
for (let i = 1; i <= 5; i++) {
    if (i === 3) {
        continue;
        // continue interrompe apenas aquela repeticao e vai para a proximma repeticao 
        // nao vai finalizar o laco for
    }
    console.log(i);
}