Algoritmo "troco"

Var

   precoUnitario, dinheiroRecebido, troco : real
   quant : inteiro

Inicio

      escreva("Preco unitario do produto: ")
      leia(precoUnitario)
      escreva("Quantidade comprada: ")
      leia(quant)
      escreva("Dinheiro recebido: ")
      leia(dinheiroRecebido)

      troco <- dinheiroRecebido - (precoUnitario * quant)

      escreval("TROCO = ", troco:8:2)

Fimalgoritmo