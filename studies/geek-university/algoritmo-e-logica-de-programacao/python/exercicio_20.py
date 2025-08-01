valor_hora = 10.00
valor_hora_excedente = 20.00
extra = 0

codigo = int(input("Informe o codigo: "))
qtd_horas = float(input("Informe a quantidade de horas trabalhadas: "))

if qtd_horas > 50:
    extra = (qtd_horas - 50) * valor_hora_excedente
    salario = (50 * valor_hora) + extra
    print("Salario Total R$ {0:.2f}".format(salario))
    print("Salario excedente R$  {0:.2f}".format(extra))
else:
    salario = (qtd_horas * valor_hora)
    print("Salario Total R$  {0:.2f}".format(salario))
    print("Salario excedente R$ {0:.2f}".format(extra))
