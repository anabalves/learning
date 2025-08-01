maior = 0

numero = int(input("Informe um numero: "))
while numero != 0:
    if numero > maior:
        maior = numero
    numero = int(input("Informe um numero: "))
print("O maior numero eh {0}".format(maior))
