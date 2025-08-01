precoUnitario: float; dinheiro: float; troco: float; valorRestante: float; total: float
quantComprada: int

precoUnitario = float(input("Preco unitario do produto: "))
quantComprada = int(input("Quantidade comprada: "))
dinheiro = float(input("Dinheiro recebido: "))

total = precoUnitario * quantComprada

if dinheiro > total:
	troco = dinheiro - total
	print(f"TROCO = {troco:.2f}")
else:
	valorRestante = total - dinheiro
	print(f"DINHEIRO INSUFICIENTE. FALTAM {valorRestante:.2f} REAIS")