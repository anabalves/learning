N: int; cont: int

N = int(input("Quantos numeros voce vai digitar? "))

vet: [int] = [0 for x in range(N)]

for i in range(N):
	vet[i] = int(input("Digite um numero: "))

cont = 0
print("\nNUMEROS PARES:")
for i in range(N):
	if vet[i] % 2 == 0:
		print(f"{vet[i]}  ", end="")
		cont = cont + 1

print(f"\n\nQUANTIDADE DE PARES = {cont}")