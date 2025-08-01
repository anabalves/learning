// Função Construtora (Classe) -> Objeto
function Data(dia, mes, ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;

    this.exibir = function() {
        return `${this.dia}/${this.mes}/${this.ano}`;
    };
};

const d1 = new Data(19, 11, 1991);
const d2 = new Data(22, 11, 2023);
const d3 = new Data(25, 11, 2055);

console.log(d1);
console.log(d2);
console.log(d3);

console.log(d1.exibir());
console.log(d2.exibir());
console.log(d3.exibir());