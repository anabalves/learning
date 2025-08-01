N: int; X: int; fora: int; dentro: int

N = int(input("Quantos numeros voce vai digitar? "))

fora = 0
dentro = 0

for i in range(N):
	X = int(input("Digite um numero: "))

	if 10 <= X <= 20:
		dentro = dentro + 1
	else:
		fora = fora + 1

print(f"{dentro} DENTRO")
print(f"{fora} FORA")