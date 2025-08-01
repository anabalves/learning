Algoritmo "media_pares"

Var

    N, i, soma, cont : inteiro
    media : real
    vet : vetor [0..99] de inteiro

Inicio

    escreva("Quantos elementos vai ter o vetor? ")
    leia(N)

    para i de 0 ate N-1 faca
        escreva("Digite um numero: ")
        leia(vet[i])
    fimpara

    cont <- 0
    soma <- 0
    para i de 0 ate N-1 faca
        se vet[i] % 2 = 0 entao
            soma <- soma + vet[i]
            cont <- cont + 1
        fimse
    fimpara

    se cont = 0 entao
       escreval("NENHUM NUMERO PAR")
    senao
       media <- soma / cont
       escreval("MEDIA DOS PARES = ", media:3:1)
    fimse
    
Fimalgoritmo