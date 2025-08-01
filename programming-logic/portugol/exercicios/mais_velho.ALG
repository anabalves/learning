Algoritmo "mais_velho"

Var

    N, i, posicao, maiorIdade : inteiro
    nomes : vetor [0..99] de caractere
    idades : vetor [0..99] de inteiro

Inicio

    escreva("Quantas pessoas voce vai digitar? ")
    leia(N)

    para i de 0 ate N-1 faca
        escreval("Dados da ", i+1, "a pessoa:")
        escreva("Nome: ")
        leia(nomes[i])
        escreva("Idade: ")
        leia(idades[i])
    fimpara

    posicao <- 0
    maiorIdade <- idades[0]

    para i de 0 ate N-1 faca
        se idades[i] > maiorIdade entao
            maiorIdade <- idades[i]
            posicao <- i
        fimse
    fimpara
    
    escreval("PESSOA MAIS VELHA: ", nomes[posicao])

Fimalgoritmo