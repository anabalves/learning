Algoritmo "glicose"

Var

   medidaGlicose : real

Inicio

     escreva("Digite a medida da glicose: ")
     leia(medidaGlicose)

     se medidaGlicose <= 100 entao
        escreval("Classificacao: normal")
     senao
          se medidaGlicose <= 140 entao
             escreval("Classificacao: elevado")
          senao
             escreval("Classificacao: diabetes")
          fimse
     fimse
     
Fimalgoritmo