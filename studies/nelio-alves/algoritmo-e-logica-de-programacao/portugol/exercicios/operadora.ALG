Algoritmo "operadora"

Var

   quantMinutos, minutosExcedentes : inteiro
   valorPagamento : real

Inicio

    escreva("Digite a quantidade de minutos: ")
    leia(quantMinutos)
    
    valorPagamento <- 50
    
    se  quantMinutos > 100 entao
        minutosExcedentes <- quantMinutos - 100
        valorPagamento <- valorPagamento + minutosExcedentes * 2
    fimse
    
    escreval("Valor a pagar: R$", valorPagamento:8:2)

Fimalgoritmo