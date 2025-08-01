N: int; posicao: int
maiorValor: float

N = int(input("Quantos numeros voce vai digitar? "))

vet: [float] = [0 for x in range(N)]

for i in range(N):
	vet[i] = float(input("Digite um numero: "))

posicao = 0
maiorValor = vet[0]

for i in range(N):
	if vet[i] > maiorValor:
		maiorValor = vet[i]
		posicao = i

print(f"\nMAIOR VALOR = {maiorValor:.1f}")
print(f"POSICAO DO MAIOR VALOR = {posicao}")