valor_por_hora = float(input("Qual valor voce ganha por hora? "))
horas_trabalhadas = int(input("Quantas horas voce trabalhou neste mes? "))

salario = horas_trabalhadas * valor_por_hora

print("Neste mes voce vai receber R$ {0:.2f}".format(salario))
