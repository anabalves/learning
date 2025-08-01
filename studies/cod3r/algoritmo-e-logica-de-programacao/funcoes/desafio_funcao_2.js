// Parâmetro (Nota) -> Retorno (Conceito)
function notaParaConceito(nota) {
    return Math.ceil(nota) == 10 ? 'A+' :
            Math.ceil(nota) == 9 ? 'A' :
            Math.ceil(nota) == 8 ? 'B+' : 
            Math.ceil(nota) == 7 ? 'B' : 
            Math.ceil(nota) == 6 ? 'C+' : 
            Math.ceil(nota) == 5 ? 'C' : 
            Math.ceil(nota) == 4 ? 'D+' : 
            Math.ceil(nota) == 3 ? 'D' : 
            Math.ceil(nota) == 2 ? 'E+' : 
            Math.ceil(nota) == 1 ? 'E' : 
            Math.ceil(nota) == 0 ? 'F' : null;
}

function notaParaConceitoRespCod3r(nota) {
    switch (Math.ceil(nota)) {
        case 10:
            return 'A+';
        case 9:
            return 'A';
        case 8:
            return 'B+';
        case 7:
            return 'B';
        case 6:
            return 'C+';
        case 5:
            return 'C';
        case 4:
            return 'D+';
        case 3:
            return 'D';
        case 2:
            return 'E+';
        case 1:
            return 'E';
        case 0:
            return 'F';
        default:
            return null;
    }
}

console.log(`O conceito do aluno é ${notaParaConceito(9.2)}`);
console.log(`O conceito do aluno é ${notaParaConceitoRespCod3r(9.2)}`);