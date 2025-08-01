import math

N: int; linha: int; coluna: int
somaPositivos: float

N = int(input("Qual a ordem da matriz? "))

mat: [[float]] = [[0 for x in range(N)] for x in range(N)]

for i in range(N):
	for j in range(N):
		mat[i][j] = float(input(f"Elemento [{i},{j}]: "))

print("\nMATRIZ DIGITADA:")
for i in range(N):
    for j in range(N):
        print(f"{mat[i][j]} ", end="")
    print()

somaPositivos = 0
for i in range(N):
	for j in range(N):
		if mat[i][j] > 0:
			somaPositivos = somaPositivos + mat[i][j]

print(f"\nSOMA DOS POSITIVOS: {somaPositivos:.1f}\n")

linha = int(input("Escolha uma linha: "))

print("LINHA ESCOLHIDA: ", end="");
for i in range(N):
	print(f"{mat[linha][i]:.1f} ", end="")

coluna = int(input("\n\nEscolha uma coluna: "))

print("COLUNA ESCOLHIDA: ", end="");
for i in range(N):
	print(f"{mat[i][linha]:.1f} ", end="")

print("\n\nDIAGONAL PRINCIPAL: ", end="");
for i in range(N):
	print(f"{mat[i][i]:.1f} ", end="")

for i in range(N):
	for j in range(N):
		if mat[i][j] < 0:
			mat[i][j] = math.pow(mat[i][j], 2);

print("\n\nMATRIZ ALTERADA:");
for i in range(N):
	for j in range(N):
		print(f"{mat[i][j]:.1f} ", end="")
	print()