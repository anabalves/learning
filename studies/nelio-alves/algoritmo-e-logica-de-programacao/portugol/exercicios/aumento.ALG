Algoritmo "aumento"

Var

   salarioAtual, novoSalario, aumento, porcentagem : real
   
Inicio

     escreva("Digite o salario da pessoa: ")
     leia(salarioAtual)

     se salarioAtual <= 1000.00 entao
        porcentagem <- 20
     senao
          se salarioAtual <= 3000.00 entao
              porcentagem <- 15
          senao
               se salarioAtual <= 8000.00 entao
                    porcentagem <- 10
               senao
                    porcentagem <- 5
               fimse
          fimse
     fimse
     
     aumento <- salarioAtual * porcentagem/100
     novoSalario <- salarioAtual + aumento
     escreval("Novo salario = R$ ", novoSalario:6:2)
     escreval("Aumento = R$ ", aumento:5:2)
     escreval("Porcentagem = ", porcentagem, "%")

Fimalgoritmo