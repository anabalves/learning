N: int; cont: int

N = int(input("Qual a ordem da matriz? "))

mat: [[int]] = [[0 for x in range(N)] for x in range(N)]

for i in range(N):
	for j in range(N):
		mat[i][j] = int(input(f"Elemento [{i},{j}]: "))

print("\nMATRIZ DIGITADA:")
for i in range(N):
    for j in range(N):
        print(f"{mat[i][j]} ", end="")
    print()

print("\nDIAGONAL PRINCIPAL:")
for i in range(N):
	print(f"{mat[i][i]} ", end="")

cont = 0
for i in range(N):
	for j in range(N):
		if mat[i][j] < 0:
			cont = cont + 1

if cont == 0:
	print("\n\nNao ha negativos na matriz")
else:
	print(f"\n\nQUANTIDADE DE NEGATIVOS = {cont}")