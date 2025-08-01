Algoritmo "teste_vetor"

Var

   vet : vetor [0..9] de real
   N, i : inteiro

Inicio

      escreva("Quantos numeros voce vai digitar? ")
      leia(N)

      para i de 0 ate N-1 faca
           escreva("Digite um numero: ")
           leia(vet[i])
      fimpara

      escreval
      escreval("NUMEROS DIGITADOS:")

      para i de 0 ate N-1 faca
           escreval(vet[i]:8:1)
      fimpara
      
Fimalgoritmo