Algoritmo "dardo"

Var

   distDardo1, distDardo2, distDardo3, maior : real

Inicio

   escreval("Digite as tres distancias: ")
   leia(distDardo1)
   leia(distDardo2)
   leia(distDardo3)

   se (distDardo1 > distDardo2) e (distDardo1 > distDardo3) entao
      maior <- distDardo1
   senao
        se (distDardo2 > distDardo3) entao
           maior <- distDardo2
        senao
           maior <- distDardo3
        fimse
   fimse

   escreval("MAIOR DISTANCIA = ", maior:4:2)

Fimalgoritmo