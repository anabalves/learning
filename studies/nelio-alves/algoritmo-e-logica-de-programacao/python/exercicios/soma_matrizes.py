M: int; N: int

M = int(input("Quantas linhas vai ter cada matriz? "))
N = int(input("Quantas colunas vai ter cada matriz? "))

A: [[int]] = [[0 for x in range(N)] for x in range(M)]
B: [[int]] = [[0 for x in range(N)] for x in range(M)]
C: [[int]] = [[0 for x in range(N)] for x in range(M)]

print("Digite os valores da matriz A:")
for i in range(M):
	for j in range(N):
		A[i][j] = int(input(f"Elemento [{i},{j}]: "))

print("Digite os valores da matriz B:")
for i in range(M):
	for j in range(N):
		B[i][j] = int(input(f"Elemento [{i},{j}]: "))

for i in range(M):
	for j in range(N):
		C[i][j] = A[i][j] + B[i][j]

print("\nMATRIZ A:")
for i in range(M):
	for j in range(N):
		print(f"{A[i][j]} ", end="")
	print()

print("\nMATRIZ B:")
for i in range(M):
	for j in range(N):
		print(f"{B[i][j]} ", end="")
	print()

print("\nMATRIZ SOMA:")
for i in range(M):
	for j in range(N):
		print(f"{C[i][j]} ", end="")
	print()