N: int; cont: int
soma: float; media: float; porcentagem: float

N = int(input("Quantas pessoas serao digitadas? "))

nomes: [str] = [0 for x in range(N)]
idades: [int] = [0 for x in range(N)]
alturas: [float] = [0 for x in range(N)]

for i in range(N):
	print(f"Dados da {i + 1}a pessoa:")
	nomes[i] = str(input("Nome: "))
	idades[i] = int(input("Idade: "))
	alturas[i] = float(input("Altura: "))

cont = 0
soma = 0
for i in range(N):
	if idades[i] < 16:
		cont = cont + 1
		soma = soma + alturas[i]

media = soma / cont
porcentagem = (float (cont) / N) * 100.0

print(f"\nAltura media = {media:.2f}")
print(f"Pessoas com menos de 16 anos: {porcentagem:.1f}%")

for i in range(N):
	if idades[i] < 16:
		print(nomes[i])