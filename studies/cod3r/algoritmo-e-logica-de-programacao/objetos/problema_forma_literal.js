const d1 = {
    dia: 19,
    mes: 11,
    ano: 1991,
    exibir: function() {
        return `${this.dia}/${this.mes}/${this.ano}`;
    },
};

const d2 = {
    dia: 22,
    mes: 11,
    ano: 2023,
    exibir: function() {
        return `${this.dia}/${this.mes}/${this.ano}`;
    },
};

const d3 = {
    dia: 25,
    mes: 11,
    ano: 2055,
    exibir: function() {
        return `${this.dia}/${this.mes}/${this.ano}`;
    },
};

console.log(d1.exibir());
console.log(d2.exibir());
console.log(d3.exibir());