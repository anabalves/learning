Algoritmo "dados_pessoas"

Var

    N, i, contMulheres, contHomens : inteiro
    somaAlturaMulheres, mediaAlturaMulheres, menorAltura, maiorAltura : real
    generos : vetor [0..99] de caractere
    alturas : vetor [0..99] de real

Inicio

    escreva("Quantas pessoas serao digitadas? ")
    leia(N)

    para i de 0 ate N-1 faca
        escreva("Altura da ", i+1, "a pessoa: ")
        leia(alturas[i])
        escreva("Genero da ", i+1, "a pessoa (f/F OU m/M): ")
        leia(generos[i])
    fimpara
    
    menorAltura <- alturas[0]
    maiorAltura <- alturas[0]
    para i de 0 ate N-1 faca
        se alturas[i] > maiorAltura entao
            maiorAltura <- alturas[i]
        fimse
        se alturas[i] < menorAltura entao
            menorAltura <- alturas[i]
        fimse
    fimpara

    escreval("Menor altura = ", menorAltura:4:2)
    escreval("Maior altura = ", maiorAltura:4:2)
    
    contMulheres <- 0
    somaAlturaMulheres <- 0
    para i de 0 ate N-1 faca
        se (generos[i] = "F") ou (generos[i] = "f") entao
            somaAlturaMulheres <- somaAlturaMulheres + alturas[i]
            contMulheres <- contMulheres + 1
        fimse
    fimpara

    se contMulheres = 0 entao
        escreval("Impossivel calcular a altura media das mulheres")
    senao
        mediaAlturaMulheres <- somaAlturaMulheres / contMulheres
        escreval("Media das alturas das mulheres = ", mediaAlturaMulheres:4:2)
    fimse

    contHomens <- N - contMulheres
    escreval("Numero de homens = ", contHomens)
    
Fimalgoritmo