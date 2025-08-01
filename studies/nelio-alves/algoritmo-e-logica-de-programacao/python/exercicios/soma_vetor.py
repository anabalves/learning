soma: float; media: float
N: int

N = int(input("Quantos numeros voce vai digitar? "))

vet: [float] = [0 for x in range(N)]

for i in range(N):
	vet[i] = float(input("Digite um numero: "))

print("\nVALORES = ", end="")
for i in range(N):
	print(f"{vet[i]:.1f}  ", end="")

soma = 0
for i in range(N):
	soma = soma + vet[i]

print(f"\nSOMA = {soma:.2f}")

media = soma / N
print(f"MEDIA = {media:.2f}")