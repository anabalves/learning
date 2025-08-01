Algoritmo "matriz_geral"

Var

   mat: vetor [0..9, 0..9] de real
   N, i, j, linha, coluna : inteiro
   somaPositivos : real

Inicio

   escreva("Qual a ordem da matriz? ")
   leia(N)

   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         escreva("Elemento [", i, ",", j, "]: ")
         leia(mat[i, j])
      fimpara
   fimpara
   
   escreval
   escreval("MATRIZ DIGITADA:")
   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         escreva(mat[i, j]:3:1)
      fimpara
      escreval
   fimpara
   escreval
   
   somaPositivos <- 0
   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         se mat[i, j] > 0 entao
            somaPositivos <- somaPositivos + mat[i, j]
         fimse
      fimpara
   fimpara
   escreval
   escreval("SOMA DOS POSITIVOS: ", somaPositivos)
   
   escreval
   escreva("Escolha uma linha: ")
   leia(linha)
   escreva("LINHA ESCOLHIDA: ")
   para j de 0 ate N-1 faca
      escreva(mat[linha, j]:3:1, " ")
   fimpara
   escreval
   
   escreval
   escreva("Escolha uma coluna: ")
   leia(coluna)
   escreva("COLUNA ESCOLHIDA: ")
   para i de 0 ate N-1 faca
      escreva(mat[i, coluna]:3:1, " ")
   fimpara
   escreval
   
   escreval
   escreva("DIAGONAL PRINCIPAL: ")
   para i de 0 ate N-1 faca
      escreva(mat[i, i]:3:1, " ")
   fimpara
   escreval
   
   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         se mat[i, j] < 0 entao
            mat[i, j] <- Exp(mat[i, j], 2)
         fimse
      fimpara
   fimpara
   
   escreval
   escreval("MATRIZ ALTERADA:")
   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         escreva(mat[i, j]:3:1, " ")
      fimpara
      escreval
   fimpara

Fimalgoritmo