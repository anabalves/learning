const nota1 = 7.8;
const nota2 = 3.1;
const nota3 = 6.1;

function minimo(num1, num2) {
    return num1 <= num2 ? num1 : num2;
}

function mediaDuasMaioresNotas(num1, num2, num3) {
    const menorNota = minimo(num1, minimo(num2, num3));
    if (menorNota === num1) {
        return (num1 + num3) / 2;
    } else if (menorNota === num2) {
        return (num1 + num3) / 2;
    } else {
        return (num1 + num2) / 2;
    }
}

function mediaParaStatus(media) {
    if (media >= 7) {
        return "Aprovado";
    } else if (media >= 4) {
        return "Recuperação";
    } else {
        return "Reprovado";
    }
}

console.log(`O resultado final do aluno é ${mediaParaStatus(mediaDuasMaioresNotas(nota1, nota2, nota3))}!`);