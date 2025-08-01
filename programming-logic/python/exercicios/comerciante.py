N: int; abaixo: int; entre: int; acima: int
totalCompra: float; totalVenda: float; totalLucro: float; lucro: float; percentualLucro: float

N = int(input("Serao digitados dados de quantos produtos? "))

nomes: [str] = [0 for x in range(N)]
precosCompra: [float] = [0 for x in range(N)]
precosVenda: [float] = [0 for x in range(N)]

for i in range(N):
	print(f"Produto {i + 1}:")
	nomes[i] = str(input("Nome: "))
	precosCompra[i] = float(input("Preco de compra: "))
	precosVenda[i] = float(input("Preco de venda: "))

abaixo = 0
entre = 0
acima = 0
for i in range(N):
	lucro = precosVenda[i] - precosCompra[i]
	percentualLucro = lucro * 100.0 / precosCompra[i]

	if percentualLucro < 10.0:
		abaixo = abaixo + 1
	elif percentualLucro < 20.0:
		entre = entre + 1
	else:
		acima = acima + 1

totalCompra = 0
totalVenda = 0
for i in range(N):
	totalCompra = totalCompra + precosCompra[i]
	totalVenda = totalVenda + precosVenda[i]

totalLucro = totalVenda - totalCompra
print("\nRELATORIO:")
print(f"Lucro abaixo de 10%: {abaixo}")
print(f"Lucro entre 10% e 20%: {entre}")
print(f"Lucro acima de 20%: {acima}")
print(f"Valor total de compra: {totalCompra:.2f}")
print(f"Valor total de venda: {totalVenda:.2f}")
print(f"Lucro total: {totalLucro:.2f}")