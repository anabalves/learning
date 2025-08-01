Algoritmo "maior_posicao"

Var

    N, i, posicao : inteiro
    maiorValor : real
    vet : vetor [0..9] de real

Inicio

    escreva("Quanto numeros voce vai digitar? ")
    leia(N)

    para i de 0 ate N-1 faca
        escreva("Digite um numero: ")
        leia(vet[i])
    fimpara

    posicao <- 0
    maiorValor <- vet[0]
      
    para i de 0 ate N-1 faca
        se vet[i] > maiorValor entao
            maiorValor <- vet[i]
            posicao <- i
        fimse
    fimpara

    escreval
    escreval("MAIOR VALOR = ", maiorValor:3:1)
    escreval("POSICAO DO MAIOR VALOR = ", posicao)
    
Fimalgoritmo