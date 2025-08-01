Algoritmo "troco_verificado"

Var

   precoUnitario, dinheiro, troco, valorRestante, total : real
   quantComprada : inteiro

Inicio

    escreva("Preco unitario do produto: ")
    leia(precoUnitario)
    escreva("Quantidade comprada: ")
    leia(quantComprada)
    escreva("Dinheiro recebido: ")
    leia(dinheiro)

    total <- precoUnitario * quantComprada

    se dinheiro > total entao
       troco <- dinheiro - total
       escreval("TROCO = ", troco:4:2)
    senao
       valorRestante <- total - dinheiro
       escreval("DINHEIRO INSUFICIENTE. FALTAM ", valorRestante:4:2, " REAIS")
    fimse
    
Fimalgoritmo