M: int; N: int

M = int(input("Qual a quantidade de linhas da matriz? "))
N = int(input("Qual a quantidade de colunas da matriz? "))

mat: [[float]] = [[0 for x in range(N)] for x in range(M)]
vet: [float] = [0 for x in range(M)]

for i in range(M):
	print(f"Digite os elementos da {i + 1} a. linha")
	for j in range(N):
		mat[i][j] = float(input())

for i in range(M):
	vet[i] = 0

	for j in range(N):
		vet[i] = vet[i] + mat[i][j]

print("VETOR GERADO:")
for i in range(M):
	print(f"{vet[i]:.1f}")