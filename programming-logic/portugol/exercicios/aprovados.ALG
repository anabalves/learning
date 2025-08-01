Algoritmo "aprovados"

Var

    N, i : inteiro
    media : real
    nomes : vetor [0..99] de caractere
    notasPrimeiroSemestre : vetor [0..99] de real
    notasSegundoSemestre : vetor [0..99] de real
    
Inicio

    escreva("Quantos alunos serao digitados?")
    leia(N)

    para i de 0 ate N-1 faca
        escreval("Digite nome, primeira e segunda nota do ", i+1, "o aluno:")
        leia(nomes[i])
        leia(notasPrimeiroSemestre[i])
        leia(notasSegundoSemestre[i])
    fimpara

    escreval("Alunos aprovados:")
    para i de 0 ate N-1 faca
        media <- (notasPrimeiroSemestre[i] + notasSegundoSemestre[i]) / 2
        se media >= 6 entao
            escreval(nomes[i])
        fimse
    fimpara

Fimalgoritmo