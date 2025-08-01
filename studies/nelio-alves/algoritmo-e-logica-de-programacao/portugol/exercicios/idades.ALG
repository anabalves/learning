Algoritmo "idades"

Var

   nomePrimeiraPessoa, nomeSegundaPessoa : caractere
   idadePrimeiraPessoa, idadeSegundaPessoa : inteiro
   idadeMedia : real

Inicio

    escreval("Dados da primeira pessoa: ")
    escreva("Nome: ")
    leia(nomePrimeiraPessoa)
    escreva("Idade: ")
    leia(idadePrimeiraPessoa)
    
    escreval("Dados da segunda pessoa: ")
    escreva("Nome: ")
    leia(nomeSegundaPessoa)
    escreva("Idade: ")
    leia(idadeSegundaPessoa)

    idadeMedia <- (idadePrimeiraPessoa +  idadeSegundaPessoa) / 2
    
    escreval("A idade média de ", nomePrimeiraPessoa, " e ", nomeSegundaPessoa, " é de ", idadeMedia:8:1, " anos")

Fimalgoritmo