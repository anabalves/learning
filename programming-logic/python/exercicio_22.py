numero = int(input("Informe um numero: "))

if numero % 2 == 0:
    if numero > 0:
        print("O número {0} eh par e positivo".format(numero))
    else:
        print("O número {0} eh par e negativo".format(numero))
else:
    if numero > 0:
        print("O número {0} eh impar e positivo".format(numero))
    else:
        print("O número {0} eh impar e negativo".format(numero))
