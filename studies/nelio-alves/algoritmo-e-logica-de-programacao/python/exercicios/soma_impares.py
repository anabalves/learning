X: int; Y: int; soma: int; troca: int

print("Digite dois numeros:")
X = int(input())
Y = int(input())

if X > Y:
	troca = X
	X = Y
	Y = troca

soma = 0
for i in range(X + 1, Y):
	if i % 2 != 0:
		soma = soma + i

print(f"SOMA DOS IMPARES = {soma}")