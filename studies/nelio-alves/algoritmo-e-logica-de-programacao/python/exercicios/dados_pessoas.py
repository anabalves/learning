N: int; contMulheres: int; contHomens: int
somaAlturaMulheres: float; mediaAlturaMulheres: float; menorAltura: float; maiorAltura: float

N = int(input("Quantas pessoas serao digitadas? "))

alturas: [float] = [0 for x in range(N)]
generos: [str] = [0 for x in range(N)]

for i in range(N):
	alturas[i] = float(input(f"Altura da {i+1}a pessoa: "))
	generos[i] = str(input(f"Genero da {i+1}a pessoa: "))

menorAltura = alturas[0]
maiorAltura = alturas[0]
for i in range(N):
	if alturas[i] > maiorAltura:
		maiorAltura = alturas[i]
	if alturas[i] < menorAltura:
		menorAltura = alturas[i]

print(f"Menor altura = {menorAltura:.2f}")
print(f"Maior altura = {maiorAltura:.2f}")

contHomens = 0
contMulheres = 0
somaAlturaMulheres = 0
for i in range(N):
	if generos[i]== 'F' or generos[i]== 'f':
		contMulheres = contMulheres + 1
		somaAlturaMulheres = somaAlturaMulheres + alturas[i]

if contMulheres == 0:
	print("Impossivel calcular a altura media das mulheres")
else:
	mediaAlturaMulheres = somaAlturaMulheres / contMulheres
	print(f"Media das alturas das mulheres = {mediaAlturaMulheres:.2f}")

contHomens = N - contMulheres
print(f"Numero de homens = {contHomens}")