Algoritmo "lanchonete"

Var

   codigoProduto, quantidade : inteiro
   valorPagamento : real

Inicio

      escreva("Codigo do produto comprado: ")
      leia(codigoProduto)
      escreva("Quantidade comprada: ")
      leia(quantidade)
      
      escolha codigoProduto
      caso 1
           valorPagamento <- 5.00 * quantidade
           escreval("Valor a pagar: R$ ", valorPagamento:4:2)
      caso 2
           valorPagamento <- 3.50 * quantidade
           escreval("Valor a pagar: R$ ", valorPagamento:4:2)
      caso 3
           valorPagamento <- 4.80 * quantidade
           escreval("Valor a pagar: R$ ", valorPagamento:4:2)
      caso 4
           valorPagamento <- 8.90 * quantidade
           escreval("Valor a pagar: R$ ", valorPagamento:4:2)
      caso 5
           valorPagamento <- 7.32 * quantidade
           escreval("Valor a pagar: R$ ", valorPagamento:4:2)
      fimescolha

Fimalgoritmo