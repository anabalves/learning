// Objeto data
// Atributos: dia, mes e ano
// Método: exibir -> "dia/mes/ano"

const data = {
    dia: 19,
    mes: 11,
    ano: 1991,
    exibir: function() {
        return `${this.dia}/${this.mes}/${this.ano}`;
    },
};

console.log(data.exibir());