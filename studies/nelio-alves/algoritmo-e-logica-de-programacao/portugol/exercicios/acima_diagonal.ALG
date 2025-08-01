Algoritmo "acima_diagonal"

Var

   mat: vetor [0..9, 0..9] de inteiro
   N, i, j, soma : inteiro

Inicio

   escreva("Qual a ordem da matriz? ")
   leia(N)

   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         escreva("Elemento [", i, ",", j, "]: ")
         leia(mat[i, j])
      fimpara
   fimpara
   
   escreval("MATRIZ DIGITADA:")
   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         escreva(mat[i, j])
      fimpara
      escreval
   fimpara

   soma <- 0
   para i de 0 ate N-1 faca
      para j de i+1 ate N-1 faca
         soma <- soma + mat[i, j]
      fimpara
   fimpara

   escreval("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = ", soma)

Fimalgoritmo