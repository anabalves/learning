Algoritmo "diagonal_negativos"

Var

   mat: vetor [0..9, 0..9] de inteiro
   N, i, j, cont : inteiro

Inicio

   escreva("Qual a ordem da matriz? ")
   leia(N)

   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         escreva("Elemento [", i, ",", j, "]: ")
         leia(mat[i, j])
      fimpara
   fimpara

   escreval("DIAGONAL PRINCIPAL:")
   para i de 0 ate N-1 faca
      escreva(mat[i, i], " ")
   fimpara
   
   cont <- 0
   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         se mat[i, j] < 0 entao
              cont <- cont + 1
         fimse
      fimpara
      escreval
   fimpara
   
   se cont = 0 entao
      escreval("Nao ha negativos na matriz")
   senao
      escreval("QUANTIDADE DE NEGATIVOS = ", cont)
   fimse
   
Fimalgoritmo