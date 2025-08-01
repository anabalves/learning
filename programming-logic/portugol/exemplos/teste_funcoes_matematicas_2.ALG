Algoritmo "teste_funcoes_matematicas_2"

Var

   a, b, c, delta, x1, x2 : real

Inicio

    a <- 2.0
    b <- 3.0
    c <- -7.0

    delta <- Exp(b, 2.0) - 4 * a * c

    x1 <- (-b + RaizQ(delta)) / 2.0 * a)
    x2 <- (-b - RaizQ(delta)) / 2.0 * a)

    escreval("X1 = ", x1)
    escreval("X2 = ", x2)

Fimalgoritmo