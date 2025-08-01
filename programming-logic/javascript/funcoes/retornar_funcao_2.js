function retornaUmaFuncao() {
    return function () {
        return function () {
            return "Bom tarde!!!";
        }
    }
}

console.log(retornaUmaFuncao)
console.log(retornaUmaFuncao())
console.log(retornaUmaFuncao()())
console.log(retornaUmaFuncao()()())