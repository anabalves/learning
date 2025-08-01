N: int; soma: int; cont: int
media: float

N = int(input("Quantos elementos vai ter o vetor? "))

vet: [int] = [0 for x in range(N)]

for i in range(N):
	vet[i] = int(input("Digite um numero: "))

cont = 0
soma = 0
for i in range(N):
	if vet[i] % 2 == 0:
		soma = soma + vet[i]
		cont = cont + 1

if cont == 0:
	print("NENHUM NUMERO PAR")
else:
	media = float(soma) / cont

	print(f"MEDIA DOS PARES = {media:.1f}")