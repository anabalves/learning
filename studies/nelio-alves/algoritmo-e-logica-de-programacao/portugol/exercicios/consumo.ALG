Algoritmo "consumo"

Var

    distancia : inteiro
    combustivel, consumo : real

Inicio

    escreva("Distancia percorrida: ")
    leia(distancia)
    escreva("Combustivel gasto: ")
    leia(combustivel)

    consumo <- distancia / combustivel

    escreval("Consumo medio = ", consumo:8:3)

Fimalgoritmo