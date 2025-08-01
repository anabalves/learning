N: int; posicao: int; maiorIdade: int

N = int(input("Quantas pessoas voce vai digitar? "))

nomes: [str] = [0 for x in range(N)]
idades: [int] = [0 for x in range(N)]

for i in range(N):
	print(f"Dados da {i+1}a pessoa:")
	nomes[i] = str(input("Nome: "))
	idades[i] = int(input("Idade: "))

posicao = 0
maiorIdade = idades[0]

for i in range(N):
	if idades[i] > maiorIdade:
		maiorIdade = idades[i]
		posicao = i

print(f"PESSOA MAIS VELHA: {nomes[posicao]}")