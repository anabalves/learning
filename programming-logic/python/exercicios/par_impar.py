N: int; num: int

N = int(input("Quantos numeros voce vai digitar? "))

for i in range(N):
	num = int(input("Digite um numero: "))

	if num == 0:
		print("NULO")
	else:
		if num % 2 == 0:
			print("PAR", end="")
		else:
			print("IMPAR", end="")
		if num > 0:
			print(" POSITIVO")
		else:
			print(" NEGATIVO")