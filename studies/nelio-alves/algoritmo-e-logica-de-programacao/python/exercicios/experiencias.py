N: int; qtd: int; totalCobaias: int; totalSapos: int; totalCoelhos: int; totalRatos: int
tipoCobaia: str
pRatos: float; pSapos: float; pCoelhos: float

N = int(input("Quantos casos de teste serao digitados? "))

totalRatos = 0
totalSapos = 0
totalCoelhos = 0

for i in range(N):
	qtd = int(input("Quantidade de cobaias: "))
	tipoCobaia = str(input("Tipo de cobaia: "))

	if tipoCobaia == 'R':
		totalRatos = totalRatos + qtd
	elif tipoCobaia == 'S':
		totalSapos = totalSapos + qtd
	else:
		totalCoelhos = totalCoelhos + qtd

totalCobaias = totalRatos + totalSapos + totalCoelhos

pCoelhos = (float(totalCoelhos) / totalCobaias) * 100.0
pRatos = (float(totalRatos) / totalCobaias) * 100.0
pSapos = (float(totalSapos) / totalCobaias) * 100.0

print("\nRELATORIO FINAL:")
print(f"Total: {totalCobaias} cobaias")
print(f"Total de coelhos: {totalCoelhos}")
print(f"Total de ratos: {totalRatos}")
print(f"Total de sapos: {totalSapos}")
print(f"Percentual de coelhos: {pCoelhos:.2f}")
print(f"Percentual de ratos: {pRatos:.2f}")
print(f"Percentual de sapos: {pSapos:.2f}")