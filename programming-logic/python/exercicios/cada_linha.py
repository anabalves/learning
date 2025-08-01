N: int; maior: int;

N = int(input("Qual a ordem da matriz? "));

mat: [[int]] = [[0 for x in range(N)] for x in range(N)]

for i in range(N):
	for j in range(N):
		mat[i][j] = int(input(f"Elemento [{i},{j}]: "))

print("\nMATRIZ DIGITADA:")
for i in range(N):
    for j in range(N):
        print(f"{mat[i][j]} ", end="")
    print()

print("\nMAIOR ELEMENTO DE CADA LINHA:")
for i in range(N):
	maior = mat[i][0]
	for j in range(1, N):
		if maior < mat[i][j]:
			maior = mat[i][j]

	print(maior)