Algoritmo "temperatura"

Var

  escala : caractere
  tempFahrenheit, tempCelsius : real

Inicio

   escreva("Voce vai digitar a temperatura em qual escala (C/F)? ")
   leia(escala)
   
   se (escala = "F") ou (escala = "f") entao
      escreva("Digite a temperatura em Fahrenheit: ")
      leia(tempFahrenheit)
      tempCelsius <- 5 / 9 * (tempFahrenheit - 32)
      escreval("Temperatura equivalente em Celsius: ", tempCelsius:4:2)
   senao
        se (escala = "C") ou (escala = "c") entao
           escreva("Digite a temperatura em Celsius: ")
           leia(tempCelsius)
           tempFahrenheit <- tempCelsius * 9 / 5 + 32
           escreval("Temperatura equivalente em Fahrenheit: ", tempFahrenheit:4:2)
        senao
           escreval("Escala invalida!")
        fimse
   fimse

Fimalgoritmo