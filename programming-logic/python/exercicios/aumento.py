salarioAtual: float; novoSalario: float; aumento: float
porcentagem: int

salarioAtual = float(input("Digite o salario da pessoa: "))

if salarioAtual <= 1000.0:
	porcentagem = 20
elif salarioAtual <= 3000.0:
	porcentagem = 15
elif salarioAtual <= 8000.0:
	porcentagem = 10
else:
	porcentagem = 5

aumento = salarioAtual * porcentagem / 100
novoSalario = salarioAtual + aumento

print(f"Novo salario = R$ {novoSalario:.2f}")
print(f"Aumento = R$ {aumento:.2f}")
print(f"Porcentagem = {porcentagem} %")